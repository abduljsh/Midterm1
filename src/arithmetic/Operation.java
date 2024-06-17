/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package arithmetic;

/**
 *
 * @author shahn
 */
public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    public static Operation fromString(String operation) {
        try {
            return Operation.valueOf(operation.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}
