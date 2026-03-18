package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivityLogOperationType implements ValuedEnum {
    BackupPolicyCreated("backupPolicyCreated"),
    BackupPolicyActivated("backupPolicyActivated"),
    BackupPolicyModified("backupPolicyModified"),
    BackupPolicyPaused("backupPolicyPaused"),
    BackupPolicyRenamed("backupPolicyRenamed"),
    DynamicRuleExecution("dynamicRuleExecution"),
    DynamicRuleDeletion("dynamicRuleDeletion"),
    ProtectionUnitLevelOffboarding("protectionUnitLevelOffboarding"),
    PolicyLevelOffboarding("policyLevelOffboarding"),
    RestoreTaskCreated("restoreTaskCreated"),
    RestoreTaskCompleted("restoreTaskCompleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActivityLogOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivityLogOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "backupPolicyCreated": return BackupPolicyCreated;
            case "backupPolicyActivated": return BackupPolicyActivated;
            case "backupPolicyModified": return BackupPolicyModified;
            case "backupPolicyPaused": return BackupPolicyPaused;
            case "backupPolicyRenamed": return BackupPolicyRenamed;
            case "dynamicRuleExecution": return DynamicRuleExecution;
            case "dynamicRuleDeletion": return DynamicRuleDeletion;
            case "protectionUnitLevelOffboarding": return ProtectionUnitLevelOffboarding;
            case "policyLevelOffboarding": return PolicyLevelOffboarding;
            case "restoreTaskCreated": return RestoreTaskCreated;
            case "restoreTaskCompleted": return RestoreTaskCompleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
