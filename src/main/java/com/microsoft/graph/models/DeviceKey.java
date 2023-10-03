package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceKey implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceId property
     */
    private UUID deviceId;
    /**
     * The keyMaterial property
     */
    private Base64url keyMaterial;
    /**
     * The keyType property
     */
    private String keyType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new DeviceKey and sets the default values.
     */
    public DeviceKey() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceKey
     */
    @jakarta.annotation.Nonnull
    public static DeviceKey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceKey();
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
     * Gets the deviceId property value. The deviceId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getDeviceId() {
        return this.deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getUUIDValue()); });
        deserializerMap.put("keyMaterial", (n) -> { this.setKeyMaterial(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("keyType", (n) -> { this.setKeyType(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyMaterial property value. The keyMaterial property
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getKeyMaterial() {
        return this.keyMaterial;
    }
    /**
     * Gets the keyType property value. The keyType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKeyType() {
        return this.keyType;
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
        writer.writeUUIDValue("deviceId", this.getDeviceId());
        writer.writeObjectValue("keyMaterial", this.getKeyMaterial());
        writer.writeStringValue("keyType", this.getKeyType());
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
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final UUID value) {
        this.deviceId = value;
    }
    /**
     * Sets the keyMaterial property value. The keyMaterial property
     * @param value Value to set for the keyMaterial property.
     */
    public void setKeyMaterial(@jakarta.annotation.Nullable final Base64url value) {
        this.keyMaterial = value;
    }
    /**
     * Sets the keyType property value. The keyType property
     * @param value Value to set for the keyType property.
     */
    public void setKeyType(@jakarta.annotation.Nullable final String value) {
        this.keyType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
