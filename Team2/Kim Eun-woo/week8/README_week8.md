# 8주차 - JPA 기초 & 영속성 컨텍스트

7주차의 메모리(ArrayList) 저장소를 **JPA + MySQL** 로 전환했습니다.

## 무엇이 바뀌었나
| 구분 | 7주차 | 8주차 |
|------|-------|-------|
| 저장소 | `MemoryMemberRepository` (ArrayList) | `LionRepository` / `StaffRepository` (`JpaRepository`) |
| 영속성 | 서버 재시작 시 데이터 소멸 | MySQL에 영구 저장 |
| CRUD 구현 | 직접 구현 | JpaRepository가 자동 제공 |

핵심 변경 파일
- `build.gradle` : `spring-boot-starter-data-jpa`, `mysql-connector-j` 추가
- `application.properties` : MySQL 접속 + JPA 설정
- `domain/Lion.java`, `domain/Staff.java` : `@Entity`, `@Id`, `@GeneratedValue` 적용
- `repository/LionRepository.java`, `StaffRepository.java` : `JpaRepository` 상속
- `service/MemberService.java` : 두 레포지토리 사용 + `@Transactional`

## 실행 전 준비
1. MySQL에서 스키마 생성
   ```sql
   CREATE DATABASE likelion DEFAULT CHARACTER SET utf8mb4;
   ```
2. `application.properties`의 `spring.datasource.password`를 본인 MySQL 비밀번호로 수정
3. 실행 후 API 호출 (test.http 참고)

## 데이터 저장 확인 (MySQL Workbench)
```sql
USE likelion;
SELECT * FROM lion;
SELECT * FROM staff;
```

> ddl-auto=update 라서 앱 실행 시 lion / staff 테이블이 자동 생성됩니다.
