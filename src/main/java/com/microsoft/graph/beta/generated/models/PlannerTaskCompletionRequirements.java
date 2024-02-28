package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerTaskCompletionRequirements implements ValuedEnum {
    None("none"),
    ChecklistCompletion("checklistCompletion"),
    UnknownFutureValue("unknownFutureValue"),
    FormCompletion("formCompletion"),
    ApprovalCompletion("approvalCompletion"),
    CompletionInHostedApp("completionInHostedApp");
    public final String value;
    PlannerTaskCompletionRequirements(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerTaskCompletionRequirements forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "checklistCompletion": return ChecklistCompletion;
            case "unknownFutureValue": return UnknownFutureValue;
            case "formCompletion": return FormCompletion;
            case "approvalCompletion": return ApprovalCompletion;
            case "completionInHostedApp": return CompletionInHostedApp;
            default: return null;
        }
    }
}
