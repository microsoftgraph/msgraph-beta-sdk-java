package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents information for a local user or group used for user rights setting.
 */
public class DeviceManagementUserRightsLocalUserOrGroup implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Admins description of this local user or group.
     */
    private String description;
    /**
     * The name of this local user or group.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The security identifier of this local user or group (e.g. S-1-5-32-544).
     */
    private String securityIdentifier;
    /**
     * Instantiates a new deviceManagementUserRightsLocalUserOrGroup and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsLocalUserOrGroup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementUserRightsLocalUserOrGroup
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementUserRightsLocalUserOrGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementUserRightsLocalUserOrGroup();
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
     * Gets the description property value. Admins description of this local user or group.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("securityIdentifier", (n) -> { this.setSecurityIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of this local user or group.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the securityIdentifier property value. The security identifier of this local user or group (e.g. S-1-5-32-544).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSecurityIdentifier() {
        return this.securityIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("securityIdentifier", this.getSecurityIdentifier());
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
     * Sets the description property value. Admins description of this local user or group.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the name property value. The name of this local user or group.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
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
    /**
     * Sets the securityIdentifier property value. The security identifier of this local user or group (e.g. S-1-5-32-544).
     * @param value Value to set for the securityIdentifier property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.securityIdentifier = value;
    }
}
