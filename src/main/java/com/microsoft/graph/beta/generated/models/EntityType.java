package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EntityType implements ValuedEnum {
    Event("event"),
    Message("message"),
    DriveItem("driveItem"),
    ExternalItem("externalItem"),
    Site("site"),
    List("list"),
    ListItem("listItem"),
    Drive("drive"),
    UnknownFutureValue("unknownFutureValue"),
    Acronym("acronym"),
    Bookmark("bookmark"),
    ChatMessage("chatMessage"),
    Person("person"),
    Qna("qna");
    public final String value;
    EntityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EntityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "event": return Event;
            case "message": return Message;
            case "driveItem": return DriveItem;
            case "externalItem": return ExternalItem;
            case "site": return Site;
            case "list": return List;
            case "listItem": return ListItem;
            case "drive": return Drive;
            case "unknownFutureValue": return UnknownFutureValue;
            case "acronym": return Acronym;
            case "bookmark": return Bookmark;
            case "chatMessage": return ChatMessage;
            case "person": return Person;
            case "qna": return Qna;
            default: return null;
        }
    }
}
