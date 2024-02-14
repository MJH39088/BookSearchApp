# 카카오 책 검색 앱

카카오 api를 사용, MVVM 패턴으로 제작하였습니다.

24.02.14 기준 프로젝트 ~ing

## 📖 상세 내용

- 카카오 API를 사용한 앱으로, MVVM 패턴이 적용되었습니다.
  
- JetPack 라이브러리를 최대한 사용했습니다. (Navigation, DataStore, Paging, WorkManager)
  
- 24.02.14 기준 현재 공부, 개발중인 앱입니다.

  ![image](https://github.com/MJH39088/BookSearchApp/assets/104211982/c07a88a8-1cef-4db8-adc3-69b39d180832)

카카오 BookSearch API를 기반으로 제작되었습니다.

Search Books에서 책을 검색하고, 클릭하면 웹뷰로 넘어가지게 되며 우하단에 있는 하트 버튼을 통해 Favorite Books로 즐겨찾기를 등록할 수 있습니다.

Favorite Books에선 Search Books에서 즐겨찾기를 등록한 책을 볼 수 있고, 왼쪽으로 스와이프하면 삭제가 가능하며, Undo 기능이 있습니다.

Settings를 통해 정확도, 날짜순으로 정렬이 가능하고, 현재 배터리 상태 (80% 이상)에 따라 자동으로 캐시를 정리해주는 기능을 키고 끌 수 있습니다.

<br><br>

## 🛠️ 언어, 기술, 라이브러리 등

Kotlin

JetPack(Navigaion, DataStore, Paging, WorkManager)

Dagger Hilt

Retrofit

Moshi

Okhttp

Flow

Coroutine

SafeArgs

Room(SQLite)

<br><br><br>
