package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingCapability implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether anonymous users dialout is allowed in a meeting. */
    private Boolean _allowAnonymousUsersToDialOut;
    /** Indicates whether anonymous users are allowed to start a meeting. */
    private Boolean _allowAnonymousUsersToStartMeeting;
    /** The autoAdmittedUsers property */
    private AutoAdmittedUsersType _autoAdmittedUsers;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new meetingCapability and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeetingCapability() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.meetingCapability");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingCapability
     */
    @javax.annotation.Nonnull
    public static MeetingCapability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingCapability();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the allowAnonymousUsersToDialOut property value. Indicates whether anonymous users dialout is allowed in a meeting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAnonymousUsersToDialOut() {
        return this._allowAnonymousUsersToDialOut;
    }
    /**
     * Gets the allowAnonymousUsersToStartMeeting property value. Indicates whether anonymous users are allowed to start a meeting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAnonymousUsersToStartMeeting() {
        return this._allowAnonymousUsersToStartMeeting;
    }
    /**
     * Gets the autoAdmittedUsers property value. The autoAdmittedUsers property
     * @return a autoAdmittedUsersType
     */
    @javax.annotation.Nullable
    public AutoAdmittedUsersType getAutoAdmittedUsers() {
        return this._autoAdmittedUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingCapability currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("allowAnonymousUsersToDialOut", (n) -> { currentObject.setAllowAnonymousUsersToDialOut(n.getBooleanValue()); });
        deserializerMap.put("allowAnonymousUsersToStartMeeting", (n) -> { currentObject.setAllowAnonymousUsersToStartMeeting(n.getBooleanValue()); });
        deserializerMap.put("autoAdmittedUsers", (n) -> { currentObject.setAutoAdmittedUsers(n.getEnumValue(AutoAdmittedUsersType.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowAnonymousUsersToDialOut", this.getAllowAnonymousUsersToDialOut());
        writer.writeBooleanValue("allowAnonymousUsersToStartMeeting", this.getAllowAnonymousUsersToStartMeeting());
        writer.writeEnumValue("autoAdmittedUsers", this.getAutoAdmittedUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowAnonymousUsersToDialOut property value. Indicates whether anonymous users dialout is allowed in a meeting.
     * @param value Value to set for the allowAnonymousUsersToDialOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAnonymousUsersToDialOut(@javax.annotation.Nullable final Boolean value) {
        this._allowAnonymousUsersToDialOut = value;
    }
    /**
     * Sets the allowAnonymousUsersToStartMeeting property value. Indicates whether anonymous users are allowed to start a meeting.
     * @param value Value to set for the allowAnonymousUsersToStartMeeting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAnonymousUsersToStartMeeting(@javax.annotation.Nullable final Boolean value) {
        this._allowAnonymousUsersToStartMeeting = value;
    }
    /**
     * Sets the autoAdmittedUsers property value. The autoAdmittedUsers property
     * @param value Value to set for the autoAdmittedUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoAdmittedUsers(@javax.annotation.Nullable final AutoAdmittedUsersType value) {
        this._autoAdmittedUsers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
