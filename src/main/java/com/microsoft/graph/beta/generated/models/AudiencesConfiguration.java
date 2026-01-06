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
public class AudiencesConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AudiencesConfiguration} and sets the default values.
     */
    public AudiencesConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AudiencesConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AudiencesConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AudiencesConfiguration();
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
     * Gets the azureAdMultipleOrgs property value. Setting to allow or disallow creation of apps with multitenant signInAudience.
     * @return a {@link AzureAdMultipleOrgsAudienceRestriction}
     */
    @jakarta.annotation.Nullable
    public AzureAdMultipleOrgsAudienceRestriction getAzureAdMultipleOrgs() {
        return this.backingStore.get("azureAdMultipleOrgs");
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
        deserializerMap.put("azureAdMultipleOrgs", (n) -> { this.setAzureAdMultipleOrgs(n.getObjectValue(AzureAdMultipleOrgsAudienceRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("personalMicrosoftAccount", (n) -> { this.setPersonalMicrosoftAccount(n.getObjectValue(AudienceRestriction::createFromDiscriminatorValue)); });
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
     * Gets the personalMicrosoftAccount property value. Setting to allow or disallow creation of apps with personal Microsoft account signInAudience.
     * @return a {@link AudienceRestriction}
     */
    @jakarta.annotation.Nullable
    public AudienceRestriction getPersonalMicrosoftAccount() {
        return this.backingStore.get("personalMicrosoftAccount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("azureAdMultipleOrgs", this.getAzureAdMultipleOrgs());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("personalMicrosoftAccount", this.getPersonalMicrosoftAccount());
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
     * Sets the azureAdMultipleOrgs property value. Setting to allow or disallow creation of apps with multitenant signInAudience.
     * @param value Value to set for the azureAdMultipleOrgs property.
     */
    public void setAzureAdMultipleOrgs(@jakarta.annotation.Nullable final AzureAdMultipleOrgsAudienceRestriction value) {
        this.backingStore.set("azureAdMultipleOrgs", value);
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
     * Sets the personalMicrosoftAccount property value. Setting to allow or disallow creation of apps with personal Microsoft account signInAudience.
     * @param value Value to set for the personalMicrosoftAccount property.
     */
    public void setPersonalMicrosoftAccount(@jakarta.annotation.Nullable final AudienceRestriction value) {
        this.backingStore.set("personalMicrosoftAccount", value);
    }
}
