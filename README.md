# 2주차 미션 - 자동차 경주 게임
**우아한 테크코스 2기 프리코스 2주차 미션**

## 기능 요구사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 기능 목록
* 사용자로부터 자동차의 이름을 입력받는다.
    - 이름을 쉼표(,)를 기준으로 분리한다.
    - [**예외**] 이름이 비어있다.
    - [**예외**] 이름이 5자를 초과한다.
    - [**예외**] 이름에 공백이 존재한다.
    - [**예외**] 같은 이름이 둘 이상 존재한다.
    - [**예외**] 이름의 수가 2 미만이다.
* 사용자로부터 시도할 횟수를 입력받는다.
    - [**예외**] 시도할 횟수가 1 미만이다.
* 0~9 사이의 임의의 값을 생성한다.
* 자동차는 입력이 4 이상인 경우 전진한다.
* 자동차의 상태를 문자열로 반환한다.
    ```
    이름 : '-' * 위치값
    lalize : -----
    ```
* 자동차 리스트에서 최대 위치를 가진 첫번째 자동차를 구한다.
* 최대 위치에 있는 자동차 목록을 구한다.
* 자동차 경주를 1회 진행한다.
* 자동차 경주 결과를 출력한다.
* 우승자 이름 목록을 구한다.
* 자동차 경주를 시뮬레이션한다.
* 우승자 이름 목록을 출력한다.
