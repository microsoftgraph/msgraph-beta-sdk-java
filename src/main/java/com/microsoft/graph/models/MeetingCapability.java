package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingCapability implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether anonymous users dialout is allowed in a meeting.
     */
    private Boolean allowAnonymousUsersToDialOut;
    /**
     * Indicates whether anonymous users are allowed to start a meeting.
     */
    private Boolean allowAnonymousUsersToStartMeeting;
    /**
     * The autoAdmittedUsers property
     */
    private AutoAdmittedUsersType autoAdmittedUsers;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new meetingCapability and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MeetingCapability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingCapability
     */
    @jakarta.annotation.Nonnull
    public static MeetingCapability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingCapability();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowAnonymousUsersToDialOut property value. Indicates whether anonymous users dialout is allowed in a meeting.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAnonymousUsersToDialOut() {
        return this.allowAnonymousUsersToDialOut;
    }
    /**
     * Gets the allowAnonymousUsersToStartMeeting property value. Indicates whether anonymous users are allowed to start a meeting.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAnonymousUsersToStartMeeting() {
        return this.allowAnonymousUsersToStartMeeting;
    }
    /**
     * Gets the autoAdmittedUsers property value. The autoAdmittedUsers property
     * @return a autoAdmittedUsersType
     */
    @jakarta.annotation.Nullable
    public AutoAdmittedUsersType getAutoAdmittedUsers() {
        return this.autoAdmittedUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowAnonymousUsersToDialOut", (n) -> { this.setAllowAnonymousUsersToDialOut(n.getBooleanValue()); });
        deserializerMap.put("allowAnonymousUsersToStartMeeting", (n) -> { this.setAllowAnonymousUsersToStartMeeting(n.getBooleanValue()); });
        deserializerMap.put("autoAdmittedUsers", (n) -> { this.setAutoAdmittedUsers(n.getEnumValue(AutoAdmittedUsersType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowAnonymousUsersToDialOut", this.getAllowAnonymousUsersToDialOut());
        writer.writeBooleanValue("allowAnonymousUsersToStartMeeting", this.getAllowAnonymousUsersToStartMeeting());
        writer.writeEnumValue("autoAdmittedUsers", this.getAutoAdmittedUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowAnonymousUsersToDialOut property value. Indicates whether anonymous users dialout is allowed in a meeting.
     * @param value Value to set for the allowAnonymousUsersToDialOut property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowAnonymousUsersToDialOut(@jakarta.annotation.Nullable final Boolean value) {
        this.allowAnonymousUsersToDialOut = value;
    }
    /**
     * Sets the allowAnonymousUsersToStartMeeting property value. Indicates whether anonymous users are allowed to start a meeting.
     * @param value Value to set for the allowAnonymousUsersToStartMeeting property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowAnonymousUsersToStartMeeting(@jakarta.annotation.Nullable final Boolean value) {
        this.allowAnonymousUsersToStartMeeting = value;
    }
    /**
     * Sets the autoAdmittedUsers property value. The autoAdmittedUsers property
     * @param value Value to set for the autoAdmittedUsers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAutoAdmittedUsers(@jakarta.annotation.Nullable final AutoAdmittedUsersType value) {
        this.autoAdmittedUsers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
