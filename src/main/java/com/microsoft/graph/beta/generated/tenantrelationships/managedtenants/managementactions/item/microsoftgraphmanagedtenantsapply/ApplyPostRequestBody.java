package com.microsoft.graph.beta.tenantrelationships.managedtenants.managementactions.item.microsoftgraphmanagedtenantsapply;

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
public class ApplyPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ApplyPostRequestBody and sets the default values.
     */
    public ApplyPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplyPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ApplyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyPostRequestBody();
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
     * Gets the excludeGroups property value. The excludeGroups property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeGroups() {
        return this.backingStore.get("excludeGroups");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("excludeGroups", (n) -> { this.setExcludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeAllUsers", (n) -> { this.setIncludeAllUsers(n.getBooleanValue()); });
        deserializerMap.put("includeGroups", (n) -> { this.setIncludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("managementTemplateId", (n) -> { this.setManagementTemplateId(n.getStringValue()); });
        deserializerMap.put("tenantGroupId", (n) -> { this.setTenantGroupId(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeAllUsers property value. The includeAllUsers property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeAllUsers() {
        return this.backingStore.get("includeAllUsers");
    }
    /**
     * Gets the includeGroups property value. The includeGroups property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeGroups() {
        return this.backingStore.get("includeGroups");
    }
    /**
     * Gets the managementTemplateId property value. The managementTemplateId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateId() {
        return this.backingStore.get("managementTemplateId");
    }
    /**
     * Gets the tenantGroupId property value. The tenantGroupId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantGroupId() {
        return this.backingStore.get("tenantGroupId");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeGroups", this.getExcludeGroups());
        writer.writeBooleanValue("includeAllUsers", this.getIncludeAllUsers());
        writer.writeCollectionOfPrimitiveValues("includeGroups", this.getIncludeGroups());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeStringValue("tenantGroupId", this.getTenantGroupId());
        writer.writeStringValue("tenantId", this.getTenantId());
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
     * Sets the excludeGroups property value. The excludeGroups property
     * @param value Value to set for the excludeGroups property.
     */
    public void setExcludeGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeGroups", value);
    }
    /**
     * Sets the includeAllUsers property value. The includeAllUsers property
     * @param value Value to set for the includeAllUsers property.
     */
    public void setIncludeAllUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includeAllUsers", value);
    }
    /**
     * Sets the includeGroups property value. The includeGroups property
     * @param value Value to set for the includeGroups property.
     */
    public void setIncludeGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeGroups", value);
    }
    /**
     * Sets the managementTemplateId property value. The managementTemplateId property
     * @param value Value to set for the managementTemplateId property.
     */
    public void setManagementTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateId", value);
    }
    /**
     * Sets the tenantGroupId property value. The tenantGroupId property
     * @param value Value to set for the tenantGroupId property.
     */
    public void setTenantGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantGroupId", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
