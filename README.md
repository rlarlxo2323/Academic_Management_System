# 학사관리 시스템

### 프로젝트 한줄 소개
Java, Java Swing을 이용하여 학사, 수업, 수강 사용자 관리 기능을 제공하는 전산 시스템을 구현하였다.</br>
사용자는 각각 교수, 학생, 직원(학사 담당/수업담당)으로 구성되어있으며, 각 데이터는 .txt파일을 이용하여 DB를 구현하였다.</br>

---

### 문제기술서
1) 학사 관리 기능</br>
 학적과의 학사 담당자는 학생 및 교수 정보를 관리해야 한다.</br> 즉, 새 학생/교수를 등록하거나 수정, 조회, 삭제를 지원해야 한다.</br> 학생에 대해서는 학번, 이름, 학과, 주민등록번호에 대한 정보가 관리되어야 하며, 교수에 대해서는 교수번호, 이름, 학과, 주민등록번호가 관리되어야 한다.</br> 학생과 교수 정보는 학번/교수 번호와 이름으로 검색할 수 있어야 한다.</br> 개설된 학과는 전산학과, 전자공학과, 화학공학과, 기계공학과, 항공우주공학과이다.

2) 수업 관리 기능</br>
 수업 담당자는 새로운 강좌를 등록할 수 있다.</br> 강좌에 대해서는 강좌 번호, 강좌 이름, 담당 학과, 학점 수 및 강좌에 대한 간단한 설명이 제공될 수 있어야 한다.</br> 수업 담당자는 등록된 강좌에 대해서만 매 학기에 강의를 개설할 수 있다.</br> 강의를 개설할 때에는 담당 교수 및 수강 가능 최소/최대 학생 수가 지정된다.</br> 한 번도 강의가 개설되지 않은 강좌에 대해서는 강좌 번호를 제외한 다른 정보에 대한 변경 및 강좌 자체에 대한 삭제가 가능하다.</br> 한 번이라도 강의가 개설된 강좌에 대해서는 강좌 정보의 변경 및 강좌의 삭제가 허용되지 않는다.

3) 수강 관리 기능</br>
 학생은 수강신청을 온라인으로 직접 할 수 있다.</br> 즉, 이번 학기에 개설된 강의에 대한 정보를 바탕으로 수강하고 싶은 과목을 선택해서 신청할 수 있다.</br> 개설되는 각 강의 별로 최대 수강 인원이 정해지며, 최대 수강 인원이 된 경우 해당 강좌에 대한 추가적인 수강 신청은 안 된다.</br> 학생은 18학점까지만 신청할 수 있다. 기본적으로 동일한 강좌에 대한 중복 수강은 허용되지 않는다.
   교수는 매 학기마다 자신이 강의하는 강좌를 신청한 학생 명단을 확인할 수 있다.</br> 교수는 학생에 대한 성적을 직접 입력할 수 있다.</br> 교수는 ‘A', 'B', 'C', 'D', 'F'의 값으로 학점을 입력할 수 있으며, 이에 대응하는 학점 값은 4.0, 3.0, 2.0, 1.0, 0이다.
   학생은 자신이 신청한 강의에 대해서 교수가 입력한 성적을 직접 확인할 수 있다.</br> 그리고 교수는 자신이 담당했던 강의의 출석부를 조회할 수 있다.</br> 출석부에는 해당 강의를 수강했던 각 학생에 대하여 학번, 이름, 취득 학점이 표시된다.
   수업 담당자는 수강 신청을 한 학생에 대하여 수강료 청구서를 발급할 수 있다.</br> 수강료 청구 기능은 학생 정보와 수강 신청 정보를 바탕으로 수강료 청구서를 발급하는 기존의 수강료 청구서 발급 시스템을 이용한다.

4) 사용자 관리 기능</br>
 등록된 학생/교수/직원에 대해서는 학생/교수/직원의 학번/교수번호/직원번호를 사용자 아이디로 한다.</br> 학생/교수/직원은 등록된 아이디와 암호를 입력하여 시스템에 로그인할 수 있다.</br> 사용자 아이디 즉, 학번/교수 번호/직원 번호는 다음과 같은 규칙을 가진다.</br>
● 학번: 첫 문자는 ‘S'로 시작하고 이어서 3자리 숫자가 나온다.</br>
● 교수 번호: 첫 문자는 ‘P'로 시작하고 이어서 3자리 숫자가 나온다.</br>
● 직원 번호: 학사 담당자는 ‘H'로 시작하고 이어서 3자리 숫자가 나온다.</br> 
● 수업 담당자는 ’G'로 시작하고 이어서 3자리의 숫자가 나온다.</br>
그리고 사용자 암호는 7자리의 영문자 및 숫자로 구성되며, 학생/교수/직원이 처음에 등록할 때 주민등록번호 뒷자리 7자리의 숫자를 초기 암호를 가진다.</br> 학생/교수/직원은 일단 시스템에 로그인을 한 후에 직접 암호를 변경할 수 있다.</br>

---

### UML-Usecase Diagram
<img src="https://user-images.githubusercontent.com/81959996/167889309-5b9105f4-339e-4bba-ba86-9458a5e81436.png"></br>

---

### 실행화면
#### ㅇㅇ

![사용자화면](image/사용자-화면.PNG)
