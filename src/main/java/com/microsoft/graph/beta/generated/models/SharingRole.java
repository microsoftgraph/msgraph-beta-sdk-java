package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharingRole implements ValuedEnum {
    None("none"),
    View("view"),
    Edit("edit"),
    ManageList("manageList"),
    Review("review"),
    RestrictedView("restrictedView"),
    SubmitOnly("submitOnly"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharingRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharingRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "view": return View;
            case "edit": return Edit;
            case "manageList": return ManageList;
            case "review": return Review;
            case "restrictedView": return RestrictedView;
            case "submitOnly": return SubmitOnly;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
