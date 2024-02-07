package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingCapability implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new MeetingCapability and sets the default values.
     */
    public MeetingCapability() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingCapability
     */
    @jakarta.annotation.Nonnull
    public static MeetingCapability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingCapability();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowAnonymousUsersToDialOut property value. Indicates whether anonymous users dialout is allowed in a meeting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAnonymousUsersToDialOut() {
        return this.backingStore.get("allowAnonymousUsersToDialOut");
    }
    /**
     * Gets the allowAnonymousUsersToStartMeeting property value. Indicates whether anonymous users are allowed to start a meeting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAnonymousUsersToStartMeeting() {
        return this.backingStore.get("allowAnonymousUsersToStartMeeting");
    }
    /**
     * Gets the autoAdmittedUsers property value. The autoAdmittedUsers property
     * @return a AutoAdmittedUsersType
     */
    @jakarta.annotation.Nullable
    public AutoAdmittedUsersType getAutoAdmittedUsers() {
        return this.backingStore.get("autoAdmittedUsers");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
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
        deserializerMap.put("autoAdmittedUsers", (n) -> { this.setAutoAdmittedUsers(n.getEnumValue(AutoAdmittedUsersType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowAnonymousUsersToDialOut", this.getAllowAnonymousUsersToDialOut());
        writer.writeBooleanValue("allowAnonymousUsersToStartMeeting", this.getAllowAnonymousUsersToStartMeeting());
        writer.writeEnumValue("autoAdmittedUsers", this.getAutoAdmittedUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the allowAnonymousUsersToDialOut property value. Indicates whether anonymous users dialout is allowed in a meeting.
     * @param value Value to set for the allowAnonymousUsersToDialOut property.
     */
    public void setAllowAnonymousUsersToDialOut(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAnonymousUsersToDialOut", value);
    }
    /**
     * Sets the allowAnonymousUsersToStartMeeting property value. Indicates whether anonymous users are allowed to start a meeting.
     * @param value Value to set for the allowAnonymousUsersToStartMeeting property.
     */
    public void setAllowAnonymousUsersToStartMeeting(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAnonymousUsersToStartMeeting", value);
    }
    /**
     * Sets the autoAdmittedUsers property value. The autoAdmittedUsers property
     * @param value Value to set for the autoAdmittedUsers property.
     */
    public void setAutoAdmittedUsers(@jakarta.annotation.Nullable final AutoAdmittedUsersType value) {
        this.backingStore.set("autoAdmittedUsers", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
