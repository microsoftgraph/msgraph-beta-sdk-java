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
 * Maps Resource Authorization Server scopes to an Entra OAuth2 permission.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdJagScopeMapping implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IdJagScopeMapping} and sets the default values.
     */
    public IdJagScopeMapping() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdJagScopeMapping}
     */
    @jakarta.annotation.Nonnull
    public static IdJagScopeMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdJagScopeMapping();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("oauth2Permission", (n) -> { this.setOauth2Permission(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("validResourceAuthorizationServerScopes", (n) -> { this.setValidResourceAuthorizationServerScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the oauth2Permission property value. Required and non-null in each scope mapping. An enabled delegated permission exposed by the resource application for ID-JAG use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOauth2Permission() {
        return this.backingStore.get("oauth2Permission");
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
     * Gets the validResourceAuthorizationServerScopes property value. Required and non-null in each scope mapping. One or two equivalent, case-sensitive Resource Authorization Server scopes for mapped behavior; empty for the single passthrough mapping.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValidResourceAuthorizationServerScopes() {
        return this.backingStore.get("validResourceAuthorizationServerScopes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("oauth2Permission", this.getOauth2Permission());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("validResourceAuthorizationServerScopes", this.getValidResourceAuthorizationServerScopes());
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
     * Sets the oauth2Permission property value. Required and non-null in each scope mapping. An enabled delegated permission exposed by the resource application for ID-JAG use.
     * @param value Value to set for the oauth2Permission property.
     */
    public void setOauth2Permission(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("oauth2Permission", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the validResourceAuthorizationServerScopes property value. Required and non-null in each scope mapping. One or two equivalent, case-sensitive Resource Authorization Server scopes for mapped behavior; empty for the single passthrough mapping.
     * @param value Value to set for the validResourceAuthorizationServerScopes property.
     */
    public void setValidResourceAuthorizationServerScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("validResourceAuthorizationServerScopes", value);
    }
}
