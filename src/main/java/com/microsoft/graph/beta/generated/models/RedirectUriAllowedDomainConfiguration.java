package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RedirectUriAllowedDomainConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RedirectUriAllowedDomainConfiguration} and sets the default values.
     */
    public RedirectUriAllowedDomainConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RedirectUriAllowedDomainConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static RedirectUriAllowedDomainConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectUriAllowedDomainConfiguration();
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
     * Gets the allowedDomains property value. The allowedDomains property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedDomains() {
        return this.backingStore.get("allowedDomains");
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
     * Gets the excludeActors property value. The excludeActors property
     * @return a {@link AppManagementPolicyActorExemptions}
     */
    @jakarta.annotation.Nullable
    public AppManagementPolicyActorExemptions getExcludeActors() {
        return this.backingStore.get("excludeActors");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("allowedDomains", (n) -> { this.setAllowedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeActors", (n) -> { this.setExcludeActors(n.getObjectValue(AppManagementPolicyActorExemptions::createFromDiscriminatorValue)); });
        deserializerMap.put("isStateSetByMicrosoft", (n) -> { this.setIsStateSetByMicrosoft(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("publicClient", (n) -> { this.setPublicClient(n.getObjectValue(RedirectUriPlatformAllowedDomainConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("restrictForAppsCreatedAfterDateTime", (n) -> { this.setRestrictForAppsCreatedAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("spa", (n) -> { this.setSpa(n.getObjectValue(RedirectUriPlatformAllowedDomainConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AppManagementRestrictionState::forValue)); });
        deserializerMap.put("web", (n) -> { this.setWeb(n.getObjectValue(RedirectUriPlatformAllowedDomainConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isStateSetByMicrosoft property value. The isStateSetByMicrosoft property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsStateSetByMicrosoft() {
        return this.backingStore.get("isStateSetByMicrosoft");
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
     * Gets the publicClient property value. The publicClient property
     * @return a {@link RedirectUriPlatformAllowedDomainConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriPlatformAllowedDomainConfiguration getPublicClient() {
        return this.backingStore.get("publicClient");
    }
    /**
     * Gets the restrictForAppsCreatedAfterDateTime property value. The restrictForAppsCreatedAfterDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestrictForAppsCreatedAfterDateTime() {
        return this.backingStore.get("restrictForAppsCreatedAfterDateTime");
    }
    /**
     * Gets the spa property value. The spa property
     * @return a {@link RedirectUriPlatformAllowedDomainConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriPlatformAllowedDomainConfiguration getSpa() {
        return this.backingStore.get("spa");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link AppManagementRestrictionState}
     */
    @jakarta.annotation.Nullable
    public AppManagementRestrictionState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the web property value. The web property
     * @return a {@link RedirectUriPlatformAllowedDomainConfiguration}
     */
    @jakarta.annotation.Nullable
    public RedirectUriPlatformAllowedDomainConfiguration getWeb() {
        return this.backingStore.get("web");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedDomains", this.getAllowedDomains());
        writer.writeObjectValue("excludeActors", this.getExcludeActors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("publicClient", this.getPublicClient());
        writer.writeOffsetDateTimeValue("restrictForAppsCreatedAfterDateTime", this.getRestrictForAppsCreatedAfterDateTime());
        writer.writeObjectValue("spa", this.getSpa());
        writer.writeEnumValue("state", this.getState());
        writer.writeObjectValue("web", this.getWeb());
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
     * Sets the allowedDomains property value. The allowedDomains property
     * @param value Value to set for the allowedDomains property.
     */
    public void setAllowedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedDomains", value);
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
     * Sets the excludeActors property value. The excludeActors property
     * @param value Value to set for the excludeActors property.
     */
    public void setExcludeActors(@jakarta.annotation.Nullable final AppManagementPolicyActorExemptions value) {
        this.backingStore.set("excludeActors", value);
    }
    /**
     * Sets the isStateSetByMicrosoft property value. The isStateSetByMicrosoft property
     * @param value Value to set for the isStateSetByMicrosoft property.
     */
    public void setIsStateSetByMicrosoft(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isStateSetByMicrosoft", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the publicClient property value. The publicClient property
     * @param value Value to set for the publicClient property.
     */
    public void setPublicClient(@jakarta.annotation.Nullable final RedirectUriPlatformAllowedDomainConfiguration value) {
        this.backingStore.set("publicClient", value);
    }
    /**
     * Sets the restrictForAppsCreatedAfterDateTime property value. The restrictForAppsCreatedAfterDateTime property
     * @param value Value to set for the restrictForAppsCreatedAfterDateTime property.
     */
    public void setRestrictForAppsCreatedAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restrictForAppsCreatedAfterDateTime", value);
    }
    /**
     * Sets the spa property value. The spa property
     * @param value Value to set for the spa property.
     */
    public void setSpa(@jakarta.annotation.Nullable final RedirectUriPlatformAllowedDomainConfiguration value) {
        this.backingStore.set("spa", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AppManagementRestrictionState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the web property value. The web property
     * @param value Value to set for the web property.
     */
    public void setWeb(@jakarta.annotation.Nullable final RedirectUriPlatformAllowedDomainConfiguration value) {
        this.backingStore.set("web", value);
    }
}
