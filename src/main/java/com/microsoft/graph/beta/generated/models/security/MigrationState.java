package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MigrationState implements ValuedEnum {
    ReadyForMigration("readyForMigration"),
    NotReadyForMigration("notReadyForMigration"),
    UpToDate("upToDate"),
    MigrationFailed("migrationFailed"),
    Migrating("migrating"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MigrationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MigrationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "readyForMigration": return ReadyForMigration;
            case "notReadyForMigration": return NotReadyForMigration;
            case "upToDate": return UpToDate;
            case "migrationFailed": return MigrationFailed;
            case "migrating": return Migrating;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
