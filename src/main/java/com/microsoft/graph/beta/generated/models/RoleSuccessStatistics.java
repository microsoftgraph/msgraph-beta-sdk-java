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
public class RoleSuccessStatistics implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RoleSuccessStatistics} and sets the default values.
     */
    public RoleSuccessStatistics() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RoleSuccessStatistics}
     */
    @jakarta.annotation.Nonnull
    public static RoleSuccessStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleSuccessStatistics();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permanentFail", (n) -> { this.setPermanentFail(n.getLongValue()); });
        deserializerMap.put("permanentSuccess", (n) -> { this.setPermanentSuccess(n.getLongValue()); });
        deserializerMap.put("removeFail", (n) -> { this.setRemoveFail(n.getLongValue()); });
        deserializerMap.put("removeSuccess", (n) -> { this.setRemoveSuccess(n.getLongValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleName", (n) -> { this.setRoleName(n.getStringValue()); });
        deserializerMap.put("temporaryFail", (n) -> { this.setTemporaryFail(n.getLongValue()); });
        deserializerMap.put("temporarySuccess", (n) -> { this.setTemporarySuccess(n.getLongValue()); });
        deserializerMap.put("unknownFail", (n) -> { this.setUnknownFail(n.getLongValue()); });
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
     * Gets the permanentFail property value. The permanentFail property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPermanentFail() {
        return this.backingStore.get("permanentFail");
    }
    /**
     * Gets the permanentSuccess property value. The permanentSuccess property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPermanentSuccess() {
        return this.backingStore.get("permanentSuccess");
    }
    /**
     * Gets the removeFail property value. The removeFail property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRemoveFail() {
        return this.backingStore.get("removeFail");
    }
    /**
     * Gets the removeSuccess property value. The removeSuccess property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRemoveSuccess() {
        return this.backingStore.get("removeSuccess");
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.backingStore.get("roleId");
    }
    /**
     * Gets the roleName property value. The roleName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleName() {
        return this.backingStore.get("roleName");
    }
    /**
     * Gets the temporaryFail property value. The temporaryFail property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTemporaryFail() {
        return this.backingStore.get("temporaryFail");
    }
    /**
     * Gets the temporarySuccess property value. The temporarySuccess property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTemporarySuccess() {
        return this.backingStore.get("temporarySuccess");
    }
    /**
     * Gets the unknownFail property value. The unknownFail property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUnknownFail() {
        return this.backingStore.get("unknownFail");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("permanentFail", this.getPermanentFail());
        writer.writeLongValue("permanentSuccess", this.getPermanentSuccess());
        writer.writeLongValue("removeFail", this.getRemoveFail());
        writer.writeLongValue("removeSuccess", this.getRemoveSuccess());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeStringValue("roleName", this.getRoleName());
        writer.writeLongValue("temporaryFail", this.getTemporaryFail());
        writer.writeLongValue("temporarySuccess", this.getTemporarySuccess());
        writer.writeLongValue("unknownFail", this.getUnknownFail());
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
     * Sets the permanentFail property value. The permanentFail property
     * @param value Value to set for the permanentFail property.
     */
    public void setPermanentFail(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("permanentFail", value);
    }
    /**
     * Sets the permanentSuccess property value. The permanentSuccess property
     * @param value Value to set for the permanentSuccess property.
     */
    public void setPermanentSuccess(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("permanentSuccess", value);
    }
    /**
     * Sets the removeFail property value. The removeFail property
     * @param value Value to set for the removeFail property.
     */
    public void setRemoveFail(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("removeFail", value);
    }
    /**
     * Sets the removeSuccess property value. The removeSuccess property
     * @param value Value to set for the removeSuccess property.
     */
    public void setRemoveSuccess(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("removeSuccess", value);
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleId", value);
    }
    /**
     * Sets the roleName property value. The roleName property
     * @param value Value to set for the roleName property.
     */
    public void setRoleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleName", value);
    }
    /**
     * Sets the temporaryFail property value. The temporaryFail property
     * @param value Value to set for the temporaryFail property.
     */
    public void setTemporaryFail(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("temporaryFail", value);
    }
    /**
     * Sets the temporarySuccess property value. The temporarySuccess property
     * @param value Value to set for the temporarySuccess property.
     */
    public void setTemporarySuccess(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("temporarySuccess", value);
    }
    /**
     * Sets the unknownFail property value. The unknownFail property
     * @param value Value to set for the unknownFail property.
     */
    public void setUnknownFail(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("unknownFail", value);
    }
}
