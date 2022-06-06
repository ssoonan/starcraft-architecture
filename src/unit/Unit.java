package unit;

abstract class Unit {
    String name;
    int HP;
}

abstract class GroundUnit extends Unit {};
abstract class AirUnit extends Unit {};

interface Actionable {
    void move(int x, int y);
    void stop();
    void hold();
}

interface Attackable {
    void attack(int x, int y);
}

abstract class ActionUnit extends Unit implements Actionable {};
abstract class OnlyAttackUnit extends Unit implements Attackable {};
abstract class AttackUnit extends Unit implements Actionable, Attackable {};

