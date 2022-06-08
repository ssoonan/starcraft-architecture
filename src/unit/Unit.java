package unit;

abstract class Unit {
    String name;
    int HP;
}

interface Actionable {
    void move(int x, int y);
    void stop();
    void hold();
}

interface Attackable {
    void attack(int x, int y);
}

interface Stop { };

interface Ground { }; // TODO: Ground 유닛도 별도로? 아니면 Flyable만 있으면 될까?
interface Air { };

abstract class ActionGroundUnit extends Unit implements Actionable, Ground {};
abstract class StopGroundUnit extends Unit implements Stop, Ground {};
abstract class OnlyAttackGroundUnit extends Unit implements Attackable, Ground {};
abstract class AttackGroundUnit extends Unit implements Actionable, Attackable, Ground {};
abstract class ActionAirUnit extends Unit implements Actionable, Air {};
abstract class StopAirUnit extends Unit implements Stop, Air {};
abstract class OnlyAttackAirUnit extends Unit implements Attackable, Air {};
abstract class AttackAirUnit extends Unit implements Actionable, Attackable, Air {};

