package com.microsoft.graph.users.item.manageddevices.movedevicestoou;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MoveDevicesToOUPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceIds property
     */
    private java.util.List<UUID> deviceIds;
    /**
     * The organizationalUnitPath property
     */
    private String organizationalUnitPath;
    /**
     * Instantiates a new MoveDevicesToOUPostRequestBody and sets the default values.
     */
    public MoveDevicesToOUPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MoveDevicesToOUPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static MoveDevicesToOUPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MoveDevicesToOUPostRequestBody();
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
     * Gets the deviceIds property value. The deviceIds property
     * @return a java.util.List<UUID>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getDeviceIds() {
        return this.deviceIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("deviceIds", (n) -> { this.setDeviceIds(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("organizationalUnitPath", (n) -> { this.setOrganizationalUnitPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the organizationalUnitPath property value. The organizationalUnitPath property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationalUnitPath() {
        return this.organizationalUnitPath;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("deviceIds", this.getDeviceIds());
        writer.writeStringValue("organizationalUnitPath", this.getOrganizationalUnitPath());
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
     * Sets the deviceIds property value. The deviceIds property
     * @param value Value to set for the deviceIds property.
     */
    public void setDeviceIds(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.deviceIds = value;
    }
    /**
     * Sets the organizationalUnitPath property value. The organizationalUnitPath property
     * @param value Value to set for the organizationalUnitPath property.
     */
    public void setOrganizationalUnitPath(@jakarta.annotation.Nullable final String value) {
        this.organizationalUnitPath = value;
    }
}
