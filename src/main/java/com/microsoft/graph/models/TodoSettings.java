package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TodoSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Controls whether users can join lists from users external to your organization.
     */
    private Boolean isExternalJoinEnabled;
    /**
     * Controls whether users can share lists with external users.
     */
    private Boolean isExternalShareEnabled;
    /**
     * Controls whether push notifications are enabled for your users.
     */
    private Boolean isPushNotificationEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new TodoSettings and sets the default values.
     */
    public TodoSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TodoSettings
     */
    @jakarta.annotation.Nonnull
    public static TodoSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TodoSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isExternalJoinEnabled", (n) -> { this.setIsExternalJoinEnabled(n.getBooleanValue()); });
        deserializerMap.put("isExternalShareEnabled", (n) -> { this.setIsExternalShareEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPushNotificationEnabled", (n) -> { this.setIsPushNotificationEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExternalJoinEnabled property value. Controls whether users can join lists from users external to your organization.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternalJoinEnabled() {
        return this.isExternalJoinEnabled;
    }
    /**
     * Gets the isExternalShareEnabled property value. Controls whether users can share lists with external users.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternalShareEnabled() {
        return this.isExternalShareEnabled;
    }
    /**
     * Gets the isPushNotificationEnabled property value. Controls whether push notifications are enabled for your users.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPushNotificationEnabled() {
        return this.isPushNotificationEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isExternalJoinEnabled", this.getIsExternalJoinEnabled());
        writer.writeBooleanValue("isExternalShareEnabled", this.getIsExternalShareEnabled());
        writer.writeBooleanValue("isPushNotificationEnabled", this.getIsPushNotificationEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isExternalJoinEnabled property value. Controls whether users can join lists from users external to your organization.
     * @param value Value to set for the isExternalJoinEnabled property.
     */
    public void setIsExternalJoinEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternalJoinEnabled = value;
    }
    /**
     * Sets the isExternalShareEnabled property value. Controls whether users can share lists with external users.
     * @param value Value to set for the isExternalShareEnabled property.
     */
    public void setIsExternalShareEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternalShareEnabled = value;
    }
    /**
     * Sets the isPushNotificationEnabled property value. Controls whether push notifications are enabled for your users.
     * @param value Value to set for the isPushNotificationEnabled property.
     */
    public void setIsPushNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isPushNotificationEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
