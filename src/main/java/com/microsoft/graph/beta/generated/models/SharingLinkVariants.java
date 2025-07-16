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
public class SharingLinkVariants implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SharingLinkVariants} and sets the default values.
     */
    public SharingLinkVariants() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharingLinkVariants}
     */
    @jakarta.annotation.Nonnull
    public static SharingLinkVariants createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingLinkVariants();
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
     * Gets the addressBarLinkPermission property value. Indicates the most permissive role with which an address bar link can be created. The possible values are: none, view, edit, manageList, review, restrictedView, submitOnly, unknownFutureValue.
     * @return a {@link SharingRole}
     */
    @jakarta.annotation.Nullable
    public SharingRole getAddressBarLinkPermission() {
        return this.backingStore.get("addressBarLinkPermission");
    }
    /**
     * Gets the allowEmbed property value. Indicates whether a link can be embedded.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getAllowEmbed() {
        return this.backingStore.get("allowEmbed");
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
        deserializerMap.put("addressBarLinkPermission", (n) -> { this.setAddressBarLinkPermission(n.getEnumValue(SharingRole::forValue)); });
        deserializerMap.put("allowEmbed", (n) -> { this.setAllowEmbed(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passwordProtected", (n) -> { this.setPasswordProtected(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("requiresAuthentication", (n) -> { this.setRequiresAuthentication(n.getObjectValue(SharingOperationStatus::createFromDiscriminatorValue)); });
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
     * Gets the passwordProtected property value. Indicates whether a link can be password protected, meaning that link users would need to enter a password to access the item for which the sharing link is produced. Creating a passwordProtected link for the first time requires providing a password.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getPasswordProtected() {
        return this.backingStore.get("passwordProtected");
    }
    /**
     * Gets the requiresAuthentication property value. Indicates whether a link requires identity authentication for recipients. Users can be verified through either an email address or identity.
     * @return a {@link SharingOperationStatus}
     */
    @jakarta.annotation.Nullable
    public SharingOperationStatus getRequiresAuthentication() {
        return this.backingStore.get("requiresAuthentication");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("addressBarLinkPermission", this.getAddressBarLinkPermission());
        writer.writeObjectValue("allowEmbed", this.getAllowEmbed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("passwordProtected", this.getPasswordProtected());
        writer.writeObjectValue("requiresAuthentication", this.getRequiresAuthentication());
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
     * Sets the addressBarLinkPermission property value. Indicates the most permissive role with which an address bar link can be created. The possible values are: none, view, edit, manageList, review, restrictedView, submitOnly, unknownFutureValue.
     * @param value Value to set for the addressBarLinkPermission property.
     */
    public void setAddressBarLinkPermission(@jakarta.annotation.Nullable final SharingRole value) {
        this.backingStore.set("addressBarLinkPermission", value);
    }
    /**
     * Sets the allowEmbed property value. Indicates whether a link can be embedded.
     * @param value Value to set for the allowEmbed property.
     */
    public void setAllowEmbed(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("allowEmbed", value);
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
     * Sets the passwordProtected property value. Indicates whether a link can be password protected, meaning that link users would need to enter a password to access the item for which the sharing link is produced. Creating a passwordProtected link for the first time requires providing a password.
     * @param value Value to set for the passwordProtected property.
     */
    public void setPasswordProtected(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("passwordProtected", value);
    }
    /**
     * Sets the requiresAuthentication property value. Indicates whether a link requires identity authentication for recipients. Users can be verified through either an email address or identity.
     * @param value Value to set for the requiresAuthentication property.
     */
    public void setRequiresAuthentication(@jakarta.annotation.Nullable final SharingOperationStatus value) {
        this.backingStore.set("requiresAuthentication", value);
    }
}
