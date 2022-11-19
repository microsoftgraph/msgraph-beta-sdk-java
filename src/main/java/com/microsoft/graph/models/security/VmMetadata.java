package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VmMetadata implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The cloudProvider property */
    private VmCloudProvider _cloudProvider;
    /** The OdataType property */
    private String _odataType;
    /** Unique identifier of the Azure resource. */
    private String _resourceId;
    /** Unique identifier of the Azure subscription the customer tenant belongs to. */
    private String _subscriptionId;
    /** Unique identifier of the virtual machine instance. */
    private String _vmId;
    /**
     * Instantiates a new vmMetadata and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VmMetadata() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.vmMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vmMetadata
     */
    @javax.annotation.Nonnull
    public static VmMetadata createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VmMetadata();
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
     * Gets the cloudProvider property value. The cloudProvider property
     * @return a vmCloudProvider
     */
    @javax.annotation.Nullable
    public VmCloudProvider getCloudProvider() {
        return this._cloudProvider;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VmMetadata currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("cloudProvider", (n) -> { currentObject.setCloudProvider(n.getEnumValue(VmCloudProvider.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { currentObject.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("vmId", (n) -> { currentObject.setVmId(n.getStringValue()); });
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
     * Gets the resourceId property value. Unique identifier of the Azure resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the subscriptionId property value. Unique identifier of the Azure subscription the customer tenant belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this._subscriptionId;
    }
    /**
     * Gets the vmId property value. Unique identifier of the virtual machine instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVmId() {
        return this._vmId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("cloudProvider", this.getCloudProvider());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("vmId", this.getVmId());
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
     * Sets the cloudProvider property value. The cloudProvider property
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final VmCloudProvider value) {
        this._cloudProvider = value;
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
    /**
     * Sets the resourceId property value. Unique identifier of the Azure resource.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the subscriptionId property value. Unique identifier of the Azure subscription the customer tenant belongs to.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this._subscriptionId = value;
    }
    /**
     * Sets the vmId property value. Unique identifier of the virtual machine instance.
     * @param value Value to set for the vmId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVmId(@javax.annotation.Nullable final String value) {
        this._vmId = value;
    }
}
