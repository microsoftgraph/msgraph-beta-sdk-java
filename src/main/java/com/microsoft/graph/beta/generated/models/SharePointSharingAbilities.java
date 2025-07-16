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
public class SharePointSharingAbilities implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SharePointSharingAbilities} and sets the default values.
     */
    public SharePointSharingAbilities() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointSharingAbilities}
     */
    @jakarta.annotation.Nonnull
    public static SharePointSharingAbilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointSharingAbilities();
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
     * Gets the anyoneLinkAbilities property value. The anyone link abilities.
     * @return a {@link LinkScopeAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkScopeAbilities getAnyoneLinkAbilities() {
        return this.backingStore.get("anyoneLinkAbilities");
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
     * Gets the directSharingAbilities property value. The direct sharing abilities.
     * @return a {@link DirectSharingAbilities}
     */
    @jakarta.annotation.Nullable
    public DirectSharingAbilities getDirectSharingAbilities() {
        return this.backingStore.get("directSharingAbilities");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("anyoneLinkAbilities", (n) -> { this.setAnyoneLinkAbilities(n.getObjectValue(LinkScopeAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("directSharingAbilities", (n) -> { this.setDirectSharingAbilities(n.getObjectValue(DirectSharingAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizationLinkAbilities", (n) -> { this.setOrganizationLinkAbilities(n.getObjectValue(LinkScopeAbilities::createFromDiscriminatorValue)); });
        deserializerMap.put("specificPeopleLinkAbilities", (n) -> { this.setSpecificPeopleLinkAbilities(n.getObjectValue(LinkScopeAbilities::createFromDiscriminatorValue)); });
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
     * Gets the organizationLinkAbilities property value. The organization link abilities.
     * @return a {@link LinkScopeAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkScopeAbilities getOrganizationLinkAbilities() {
        return this.backingStore.get("organizationLinkAbilities");
    }
    /**
     * Gets the specificPeopleLinkAbilities property value. The specificPeople link abilities.
     * @return a {@link LinkScopeAbilities}
     */
    @jakarta.annotation.Nullable
    public LinkScopeAbilities getSpecificPeopleLinkAbilities() {
        return this.backingStore.get("specificPeopleLinkAbilities");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("anyoneLinkAbilities", this.getAnyoneLinkAbilities());
        writer.writeObjectValue("directSharingAbilities", this.getDirectSharingAbilities());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("organizationLinkAbilities", this.getOrganizationLinkAbilities());
        writer.writeObjectValue("specificPeopleLinkAbilities", this.getSpecificPeopleLinkAbilities());
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
     * Sets the anyoneLinkAbilities property value. The anyone link abilities.
     * @param value Value to set for the anyoneLinkAbilities property.
     */
    public void setAnyoneLinkAbilities(@jakarta.annotation.Nullable final LinkScopeAbilities value) {
        this.backingStore.set("anyoneLinkAbilities", value);
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
     * Sets the directSharingAbilities property value. The direct sharing abilities.
     * @param value Value to set for the directSharingAbilities property.
     */
    public void setDirectSharingAbilities(@jakarta.annotation.Nullable final DirectSharingAbilities value) {
        this.backingStore.set("directSharingAbilities", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the organizationLinkAbilities property value. The organization link abilities.
     * @param value Value to set for the organizationLinkAbilities property.
     */
    public void setOrganizationLinkAbilities(@jakarta.annotation.Nullable final LinkScopeAbilities value) {
        this.backingStore.set("organizationLinkAbilities", value);
    }
    /**
     * Sets the specificPeopleLinkAbilities property value. The specificPeople link abilities.
     * @param value Value to set for the specificPeopleLinkAbilities property.
     */
    public void setSpecificPeopleLinkAbilities(@jakarta.annotation.Nullable final LinkScopeAbilities value) {
        this.backingStore.set("specificPeopleLinkAbilities", value);
    }
}
