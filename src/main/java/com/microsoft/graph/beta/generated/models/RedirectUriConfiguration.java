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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RedirectUriConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RedirectUriConfiguration} and sets the default values.
     */
    public RedirectUriConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RedirectUriConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static RedirectUriConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectUriConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("uriWithBlockedDomain", (n) -> { this.setUriWithBlockedDomain(n.getObjectValue(RedirectUriBlockedDomainConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("uriWithBlockedScheme", (n) -> { this.setUriWithBlockedScheme(n.getObjectValue(RedirectUriBlockedSchemeConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("uriWithoutAllowedDomain", (n) -> { this.setUriWithoutAllowedDomain(n.getObjectValue(RedirectUriAllowedDomainConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("uriWithoutAllowedScheme", (n) -> { this.setUriWithoutAllowedScheme(n.getObjectValue(RedirectUriAllowedSchemeConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("uriWithWildcard", (n) -> { this.setUriWithWildcard(n.getObjectValue(RedirectUriWildcardConfiguration::createFromDiscriminatorValue)); });
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
     * Gets the uriWithBlockedDomain property value. The uriWithBlockedDomain property
     * @return a {@link RedirectUriBlockedDomainConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriBlockedDomainConfiguration getUriWithBlockedDomain() {
        return this.backingStore.get("uriWithBlockedDomain");
    }
    /**
     * Gets the uriWithBlockedScheme property value. The uriWithBlockedScheme property
     * @return a {@link RedirectUriBlockedSchemeConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriBlockedSchemeConfiguration getUriWithBlockedScheme() {
        return this.backingStore.get("uriWithBlockedScheme");
    }
    /**
     * Gets the uriWithoutAllowedDomain property value. The uriWithoutAllowedDomain property
     * @return a {@link RedirectUriAllowedDomainConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriAllowedDomainConfiguration getUriWithoutAllowedDomain() {
        return this.backingStore.get("uriWithoutAllowedDomain");
    }
    /**
     * Gets the uriWithoutAllowedScheme property value. The uriWithoutAllowedScheme property
     * @return a {@link RedirectUriAllowedSchemeConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriAllowedSchemeConfiguration getUriWithoutAllowedScheme() {
        return this.backingStore.get("uriWithoutAllowedScheme");
    }
    /**
     * Gets the uriWithWildcard property value. The uriWithWildcard property
     * @return a {@link RedirectUriWildcardConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriWildcardConfiguration getUriWithWildcard() {
        return this.backingStore.get("uriWithWildcard");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("uriWithBlockedDomain", this.getUriWithBlockedDomain());
        writer.writeObjectValue("uriWithBlockedScheme", this.getUriWithBlockedScheme());
        writer.writeObjectValue("uriWithoutAllowedDomain", this.getUriWithoutAllowedDomain());
        writer.writeObjectValue("uriWithoutAllowedScheme", this.getUriWithoutAllowedScheme());
        writer.writeObjectValue("uriWithWildcard", this.getUriWithWildcard());
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
     * Sets the uriWithBlockedDomain property value. The uriWithBlockedDomain property
     * @param value Value to set for the uriWithBlockedDomain property.
     */
    public void setUriWithBlockedDomain(@jakarta.annotation.Nullable final RedirectUriBlockedDomainConfiguration value) {
        this.backingStore.set("uriWithBlockedDomain", value);
    }
    /**
     * Sets the uriWithBlockedScheme property value. The uriWithBlockedScheme property
     * @param value Value to set for the uriWithBlockedScheme property.
     */
    public void setUriWithBlockedScheme(@jakarta.annotation.Nullable final RedirectUriBlockedSchemeConfiguration value) {
        this.backingStore.set("uriWithBlockedScheme", value);
    }
    /**
     * Sets the uriWithoutAllowedDomain property value. The uriWithoutAllowedDomain property
     * @param value Value to set for the uriWithoutAllowedDomain property.
     */
    public void setUriWithoutAllowedDomain(@jakarta.annotation.Nullable final RedirectUriAllowedDomainConfiguration value) {
        this.backingStore.set("uriWithoutAllowedDomain", value);
    }
    /**
     * Sets the uriWithoutAllowedScheme property value. The uriWithoutAllowedScheme property
     * @param value Value to set for the uriWithoutAllowedScheme property.
     */
    public void setUriWithoutAllowedScheme(@jakarta.annotation.Nullable final RedirectUriAllowedSchemeConfiguration value) {
        this.backingStore.set("uriWithoutAllowedScheme", value);
    }
    /**
     * Sets the uriWithWildcard property value. The uriWithWildcard property
     * @param value Value to set for the uriWithWildcard property.
     */
    public void setUriWithWildcard(@jakarta.annotation.Nullable final RedirectUriWildcardConfiguration value) {
        this.backingStore.set("uriWithWildcard", value);
    }
}
