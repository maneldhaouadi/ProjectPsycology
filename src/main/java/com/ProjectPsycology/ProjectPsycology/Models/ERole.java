package com.ProjectPsycology.ProjectPsycology.Models;

public enum ERole {
    ROLE_USER(1),
    ROLE_MEDECIN(2),
    ROLE_STUDENT(3);

    private final int roleNumber;

    ERole(int roleNumber) {
        this.roleNumber = roleNumber;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public static ERole findByRoleNumber(int roleNumber) {
        for (ERole role : values()) {
            if (role.getRoleNumber() == roleNumber) {
                return role;
            }
        }
        return null; // Retourne null si aucun rôle correspondant n'est trouvé
    }
}


