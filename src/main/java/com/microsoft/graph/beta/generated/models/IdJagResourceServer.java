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
/**
 * Configures resource URI matching and Resource Authorization Server scope mapping for one ID-JAG resource server. Across entries, overlapping normalized resource domains are allowed only when every common accepted external scope resolves to the same Entra OAuth2 permission.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdJagResourceServer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IdJagResourceServer} and sets the default values.
     */
    public IdJagResourceServer() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdJagResourceServer}
     */
    @jakarta.annotation.Nonnull
    public static IdJagResourceServer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdJagResourceServer();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceServerUriMatchType", (n) -> { this.setResourceServerUriMatchType(n.getEnumValue(IdJagResourceServerUriMatchType::forValue)); });
        deserializerMap.put("resourceServerUris", (n) -> { this.setResourceServerUris(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("scopeMappings", (n) -> { this.setScopeMappings(n.getCollectionOfObjectValues(IdJagScopeMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("scopeMappingType", (n) -> { this.setScopeMappingType(n.getEnumValue(IdJagScopeMappingType::forValue)); });
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
     * Gets the resourceServerUriMatchType property value. Required and non-null in each resource server entry. Matching precedence is exact, longest pathPrefix, then anyURI; absent applies only when no resource is supplied. Overlap is rejected when a common accepted external scope resolves to a different Entra OAuth2 permission across entries.
     * @return a {@link IdJagResourceServerUriMatchType}
     */
    @jakarta.annotation.Nullable
    public IdJagResourceServerUriMatchType getResourceServerUriMatchType() {
        return this.backingStore.get("resourceServerUriMatchType");
    }
    /**
     * Gets the resourceServerUris property value. Required and non-null in each resource server entry. Non-empty for exact and pathPrefix; empty for absent and anyURI.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceServerUris() {
        return this.backingStore.get("resourceServerUris");
    }
    /**
     * Gets the scopeMappings property value. Required and non-null in each resource server entry. Empty for direct, non-empty for mapped, and exactly one entry with an empty validResourceAuthorizationServerScopes collection for passthrough.
     * @return a {@link java.util.List<IdJagScopeMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdJagScopeMapping> getScopeMappings() {
        return this.backingStore.get("scopeMappings");
    }
    /**
     * Gets the scopeMappingType property value. Required and non-null in each resource server entry. Specifies direct, mapped, or passthrough scope behavior used to detect contradictory scope-to-permission outcomes across overlapping resource domains.
     * @return a {@link IdJagScopeMappingType}
     */
    @jakarta.annotation.Nullable
    public IdJagScopeMappingType getScopeMappingType() {
        return this.backingStore.get("scopeMappingType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("resourceServerUriMatchType", this.getResourceServerUriMatchType());
        writer.writeCollectionOfPrimitiveValues("resourceServerUris", this.getResourceServerUris());
        writer.writeCollectionOfObjectValues("scopeMappings", this.getScopeMappings());
        writer.writeEnumValue("scopeMappingType", this.getScopeMappingType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the resourceServerUriMatchType property value. Required and non-null in each resource server entry. Matching precedence is exact, longest pathPrefix, then anyURI; absent applies only when no resource is supplied. Overlap is rejected when a common accepted external scope resolves to a different Entra OAuth2 permission across entries.
     * @param value Value to set for the resourceServerUriMatchType property.
     */
    public void setResourceServerUriMatchType(@jakarta.annotation.Nullable final IdJagResourceServerUriMatchType value) {
        this.backingStore.set("resourceServerUriMatchType", value);
    }
    /**
     * Sets the resourceServerUris property value. Required and non-null in each resource server entry. Non-empty for exact and pathPrefix; empty for absent and anyURI.
     * @param value Value to set for the resourceServerUris property.
     */
    public void setResourceServerUris(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resourceServerUris", value);
    }
    /**
     * Sets the scopeMappings property value. Required and non-null in each resource server entry. Empty for direct, non-empty for mapped, and exactly one entry with an empty validResourceAuthorizationServerScopes collection for passthrough.
     * @param value Value to set for the scopeMappings property.
     */
    public void setScopeMappings(@jakarta.annotation.Nullable final java.util.List<IdJagScopeMapping> value) {
        this.backingStore.set("scopeMappings", value);
    }
    /**
     * Sets the scopeMappingType property value. Required and non-null in each resource server entry. Specifies direct, mapped, or passthrough scope behavior used to detect contradictory scope-to-permission outcomes across overlapping resource domains.
     * @param value Value to set for the scopeMappingType property.
     */
    public void setScopeMappingType(@jakarta.annotation.Nullable final IdJagScopeMappingType value) {
        this.backingStore.set("scopeMappingType", value);
    }
}
