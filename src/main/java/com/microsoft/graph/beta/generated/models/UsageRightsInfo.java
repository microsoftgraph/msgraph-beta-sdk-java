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
public class UsageRightsInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UsageRightsInfo} and sets the default values.
     */
    public UsageRightsInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UsageRightsInfo}
     */
    @jakarta.annotation.Nonnull
    public static UsageRightsInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageRightsInfo();
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
     * Gets the allowCopy property value. Indicates whether the user has permission to copy content from the protected resource. When true, copying is allowed; when false, copying is restricted by the sensitivity label policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCopy() {
        return this.backingStore.get("allowCopy");
    }
    /**
     * Gets the allowEdit property value. Indicates whether the user has permission to edit or modify the protected content. When true, editing is allowed; when false, the content is read-only for this user.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEdit() {
        return this.backingStore.get("allowEdit");
    }
    /**
     * Gets the allowExport property value. Indicates whether the user has permission to export or save the protected content to external locations. When true, exporting is allowed; when false, export operations are restricted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowExport() {
        return this.backingStore.get("allowExport");
    }
    /**
     * Gets the allowPrint property value. Indicates whether the user has permission to print the protected content. When true, printing is allowed; when false, print functionality is disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPrint() {
        return this.backingStore.get("allowPrint");
    }
    /**
     * Gets the allowView property value. Indicates whether the user has permission to view or access the protected content. When true, the user can view the content; when false, access is denied.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowView() {
        return this.backingStore.get("allowView");
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
        deserializerMap.put("allowCopy", (n) -> { this.setAllowCopy(n.getBooleanValue()); });
        deserializerMap.put("allowEdit", (n) -> { this.setAllowEdit(n.getBooleanValue()); });
        deserializerMap.put("allowExport", (n) -> { this.setAllowExport(n.getBooleanValue()); });
        deserializerMap.put("allowPrint", (n) -> { this.setAllowPrint(n.getBooleanValue()); });
        deserializerMap.put("allowView", (n) -> { this.setAllowView(n.getBooleanValue()); });
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
        writer.writeBooleanValue("allowCopy", this.getAllowCopy());
        writer.writeBooleanValue("allowEdit", this.getAllowEdit());
        writer.writeBooleanValue("allowExport", this.getAllowExport());
        writer.writeBooleanValue("allowPrint", this.getAllowPrint());
        writer.writeBooleanValue("allowView", this.getAllowView());
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
     * Sets the allowCopy property value. Indicates whether the user has permission to copy content from the protected resource. When true, copying is allowed; when false, copying is restricted by the sensitivity label policy.
     * @param value Value to set for the allowCopy property.
     */
    public void setAllowCopy(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCopy", value);
    }
    /**
     * Sets the allowEdit property value. Indicates whether the user has permission to edit or modify the protected content. When true, editing is allowed; when false, the content is read-only for this user.
     * @param value Value to set for the allowEdit property.
     */
    public void setAllowEdit(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowEdit", value);
    }
    /**
     * Sets the allowExport property value. Indicates whether the user has permission to export or save the protected content to external locations. When true, exporting is allowed; when false, export operations are restricted.
     * @param value Value to set for the allowExport property.
     */
    public void setAllowExport(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowExport", value);
    }
    /**
     * Sets the allowPrint property value. Indicates whether the user has permission to print the protected content. When true, printing is allowed; when false, print functionality is disabled.
     * @param value Value to set for the allowPrint property.
     */
    public void setAllowPrint(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowPrint", value);
    }
    /**
     * Sets the allowView property value. Indicates whether the user has permission to view or access the protected content. When true, the user can view the content; when false, access is denied.
     * @param value Value to set for the allowView property.
     */
    public void setAllowView(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowView", value);
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
}
