<div align="center">

# USE-CAP

### Hệ thống sinh và kiểm tra ràng buộc OCL tự động từ đặc tả chú thích

Hỗ trợ:

Chuyển đổi Chú thích → OCL độc lập  
Kiểm tra ràng buộc OCL trong ngữ cảnh mô hình miền
Tích hợp plugin vào môi trường USE

</div>

---

# Tổng quan

**USE-CAP** được phát triển như một plugin của nền tảng **USE (UML-based Specification Environment)**.

Mục tiêu của plugin là:

- Định nghĩa các mẫu CAP, cùng các biến thể nhằm làm ví dụ minh họa cho người sử dụng
- Sinh ràng buộc **OCL (Object Constraint Language)** tự động
- Kiểm tra tính hợp lệ của OCL với mô hình UML
- Hỗ trợ quy trình phát triển hướng mô hình (Model-Driven Engineering)

Dự án được xây dựng trong khuôn khổ **khóa luận tốt nghiệp**, tập trung vào bài toán sinh và xác thực ràng buộc tự động.

---

# Chức năng chính

## 1. Quản lý CAP

Hệ thống cho phép tạo và quản lý CAP với các thông tin:

- Sơ đồ lớp (Class Diagram)
- Mô tả chức năng
- Thông tin xem nhanh (Preview)

Giúp người dùng dễ dàng hiểu ý nghĩa và cấu trúc của từng CAP.

---

## 2. Phân loại CAP

Cho phép gán **semantic type** cho từng CAP dựa trên logic nghiệp vụ nhằm giúp người dùng có cái nhìn trực quan hơn về các biến thể.

---

## 3. Chuyển đổi chú thích → OCL độc lập

Cho phép sinh ràng buộc OCL trực tiếp từ chú thích mà **không cần ngữ cảnh**.

Phù hợp cho:

- Kiểm thử nhanh
- Sinh OCL độc lập
- Kiểm tra ngữ pháp chú thích

---

## 4. Kiểm tra theo mô hình miền

Hệ thống hỗ trợ sinh OCL dựa trên ngữ cảnh của file domain model `.use`.

OCL sinh ra sẽ được kiểm tra để đảm bảo:

- Đúng cú pháp
- Tham chiếu hợp lệ
- Tương thích cấu trúc UML
- Phù hợp với các phần tử trong mô hình

---

# Kiến trúc dự án

```text
root
├── use-cap
├── use-assembly
├── use-gui
└── ...
```

| Module | Vai trò |
|---------|----------|
| `use-cap` | Plugin CAP chính |
| `use-gui` | Tài nguyên giao diện và runtime |
| `use-assembly` | Đóng gói ứng dụng USE |

---

# Yêu cầu môi trường

Trước khi chạy dự án, cần cài đặt:

- Java
- Maven

Kiểm tra phiên bản:

```bash
java -version
mvn -version
```

---

# Clone Repository

```bash
git clone https://github.com/shibeinu3110/CAP_Thesis_2026.git
```

---

# Hướng dẫn cài đặt

## Bước 1 — Tải tài nguyên cần thiết

Tải file:

```text
bin.zip
```

trong phần tài nguyên của repository.

---

## Bước 2 — Giải nén

Giải nén file đã tải.

---

## Bước 3 — Copy thư mục `bin`

Sao chép thư mục `bin` vào:

```text
use-gui/src/main/resources/
```

Cấu trúc sau khi copy:

```text
resources
├── bin
├── images
└── ...
```

---

# Chạy dự án

Có hai cách chạy hệ thống:

- Build thủ công
- Sử dụng script tự động

Tuy nhiên, cả 2 cách đều cần chạy lệnh này đầu tiên

```bash
mvn clean install
```

---

# Cách 1 — Build thủ công

## Bước 1: Build plugin

Chạy tại thư mục root:

```bash
mvn clean package -pl use-cap -am
```

---

## Bước 2: Copy file JAR

Copy file `.jar` được sinh tại:

```text
use-cap/target/
```

vào:

```text
use-assembly/src/main/resources/plugins/
```

---

## Bước 3: Build USE Assembly

```bash
mvn package -pl use-assembly
```

---

## Bước 4: Giải nén và chạy ứng dụng

Giải nén file:

```text
use-assembly/target/use-7.1.1.zip
```

Sau đó chạy:

```text
bin/start_use.bat
```

để khởi động ứng dụng.

---

# Cách 2 — Sử dụng script tự động

Khóa luận có script hỗ trợ build và chạy toàn bộ hệ thống.

## Bước 1: Mở file script

```text
run-use.bat
```

---

## Bước 2: Cấu hình thư mục dự án

Cập nhật biến:

```text
ROOT_DIR
```

theo đường dẫn repository trên máy của bạn.

---

## Bước 3: Chạy script

Mở CMD và chạy:

```bash
run-use.bat
```

Script sẽ tự động:

- Build plugin
- Copy artifact cần thiết
- Build USE assembly
- Khởi chạy ứng dụng

---

# Cài đặt thành công

Nếu quá trình chạy thành công, plugin sẽ xuất hiện trong giao diện USE.

<img width="493" height="215" alt="image" src="https://github.com/user-attachments/assets/12643329-bb1d-4a1f-81a3-5ca3ef805ac4" />

---

# Công nghệ sử dụng

| Công nghệ | Mục đích |
|------------|-----------|
| Java | Phát triển hệ thống |
| Maven | Build & quản lý dependency |
| ANTLR | Parsing Annotation |
| OCL | Đặc tả ràng buộc |
| USE | Môi trường UML/OCL |

---

# Hướng phát triển

Các cải tiến dự kiến trong tương lai:

- Kiểm tra semantic OCL nâng cao
- Mở rộng khả năng parsing annotation
- Cải thiện giao diện người dùng
- Bổ sung thêm CAP template
- Hỗ trợ import/export
- Hiển thị lỗi trực quan hơn

---

# Đóng góp

Quy trình đóng góp:

1. Fork repository
2. Tạo branch mới
3. Phát triển tính năng / sửa lỗi
4. Tạo Pull Request

---

# Liên hệ hỗ trợ

Nếu gặp lỗi hoặc có câu hỏi:

- Tạo Issue trên GitHub
- Hoặc liên hệ:

```text
22028033@vnu.edu.vn
```

