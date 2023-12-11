package com.microsoft.graph.beta.models.networkaccess;

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
public class BranchConnectivityConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new BranchConnectivityConfiguration and sets the default values.
     */
    public BranchConnectivityConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BranchConnectivityConfiguration
     */
    @jakarta.annotation.Nonnull
    public static BranchConnectivityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BranchConnectivityConfiguration();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the branchId property value. Unique identifier or a specific reference assigned to a branchSite. Key.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBranchId() {
        return this.backingStore.get("branchId");
    }
    /**
     * Gets the branchName property value. Display name assigned to a branchSite.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBranchName() {
        return this.backingStore.get("branchName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("branchId", (n) -> { this.setBranchId(n.getStringValue()); });
        deserializerMap.put("branchName", (n) -> { this.setBranchName(n.getStringValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(ConnectivityConfigurationLink::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the links property value. List of connectivity configurations for deviceLink objects.
     * @return a java.util.List<ConnectivityConfigurationLink>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectivityConfigurationLink> getLinks() {
        return this.backingStore.get("links");
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
        writer.writeStringValue("branchId", this.getBranchId());
        writer.writeStringValue("branchName", this.getBranchName());
        writer.writeCollectionOfObjectValues("links", this.getLinks());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the branchId property value. Unique identifier or a specific reference assigned to a branchSite. Key.
     * @param value Value to set for the branchId property.
     */
    public void setBranchId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("branchId", value);
    }
    /**
     * Sets the branchName property value. Display name assigned to a branchSite.
     * @param value Value to set for the branchName property.
     */
    public void setBranchName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("branchName", value);
    }
    /**
     * Sets the links property value. List of connectivity configurations for deviceLink objects.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final java.util.List<ConnectivityConfigurationLink> value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
