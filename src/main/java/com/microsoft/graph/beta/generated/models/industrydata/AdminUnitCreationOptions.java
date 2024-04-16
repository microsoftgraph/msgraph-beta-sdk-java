package com.microsoft.graph.beta.models.industrydata;

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
public class AdminUnitCreationOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AdminUnitCreationOptions} and sets the default values.
     */
    public AdminUnitCreationOptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminUnitCreationOptions}
     */
    @jakarta.annotation.Nonnull
    public static AdminUnitCreationOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminUnitCreationOptions();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the createBasedOnOrg property value. Indicates whether the administrative unit should be created based on the org.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateBasedOnOrg() {
        return this.backingStore.get("createBasedOnOrg");
    }
    /**
     * Gets the createBasedOnOrgPlusRoleGroup property value. Indicates whether the administrative unit should be created based on the org and role group.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateBasedOnOrgPlusRoleGroup() {
        return this.backingStore.get("createBasedOnOrgPlusRoleGroup");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("createBasedOnOrg", (n) -> { this.setCreateBasedOnOrg(n.getBooleanValue()); });
        deserializerMap.put("createBasedOnOrgPlusRoleGroup", (n) -> { this.setCreateBasedOnOrgPlusRoleGroup(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
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
        writer.writeBooleanValue("createBasedOnOrg", this.getCreateBasedOnOrg());
        writer.writeBooleanValue("createBasedOnOrgPlusRoleGroup", this.getCreateBasedOnOrgPlusRoleGroup());
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
     * Sets the createBasedOnOrg property value. Indicates whether the administrative unit should be created based on the org.
     * @param value Value to set for the createBasedOnOrg property.
     */
    public void setCreateBasedOnOrg(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("createBasedOnOrg", value);
    }
    /**
     * Sets the createBasedOnOrgPlusRoleGroup property value. Indicates whether the administrative unit should be created based on the org and role group.
     * @param value Value to set for the createBasedOnOrgPlusRoleGroup property.
     */
    public void setCreateBasedOnOrgPlusRoleGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("createBasedOnOrgPlusRoleGroup", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
