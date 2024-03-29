package com.microsoft.graph.beta.communications.calls.item.redirect;

import com.microsoft.graph.beta.models.CallDisposition;
import com.microsoft.graph.beta.models.InvitationParticipantInfo;
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
public class RedirectPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RedirectPostRequestBody} and sets the default values.
     */
    public RedirectPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RedirectPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static RedirectPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectPostRequestBody();
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
     * Gets the callbackUri property value. The callbackUri property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallbackUri() {
        return this.backingStore.get("callbackUri");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("callbackUri", (n) -> { this.setCallbackUri(n.getStringValue()); });
        deserializerMap.put("maskCallee", (n) -> { this.setMaskCallee(n.getBooleanValue()); });
        deserializerMap.put("maskCaller", (n) -> { this.setMaskCaller(n.getBooleanValue()); });
        deserializerMap.put("targetDisposition", (n) -> { this.setTargetDisposition(n.getEnumValue(CallDisposition::forValue)); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maskCallee property value. The maskCallee property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMaskCallee() {
        return this.backingStore.get("maskCallee");
    }
    /**
     * Gets the maskCaller property value. The maskCaller property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMaskCaller() {
        return this.backingStore.get("maskCaller");
    }
    /**
     * Gets the targetDisposition property value. The targetDisposition property
     * @return a {@link CallDisposition}
     */
    @jakarta.annotation.Nullable
    public CallDisposition getTargetDisposition() {
        return this.backingStore.get("targetDisposition");
    }
    /**
     * Gets the targets property value. The targets property
     * @return a {@link java.util.List<InvitationParticipantInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getTargets() {
        return this.backingStore.get("targets");
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimeout() {
        return this.backingStore.get("timeout");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeBooleanValue("maskCallee", this.getMaskCallee());
        writer.writeBooleanValue("maskCaller", this.getMaskCaller());
        writer.writeEnumValue("targetDisposition", this.getTargetDisposition());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeIntegerValue("timeout", this.getTimeout());
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
     * Sets the callbackUri property value. The callbackUri property
     * @param value Value to set for the callbackUri property.
     */
    public void setCallbackUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callbackUri", value);
    }
    /**
     * Sets the maskCallee property value. The maskCallee property
     * @param value Value to set for the maskCallee property.
     */
    public void setMaskCallee(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("maskCallee", value);
    }
    /**
     * Sets the maskCaller property value. The maskCaller property
     * @param value Value to set for the maskCaller property.
     */
    public void setMaskCaller(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("maskCaller", value);
    }
    /**
     * Sets the targetDisposition property value. The targetDisposition property
     * @param value Value to set for the targetDisposition property.
     */
    public void setTargetDisposition(@jakarta.annotation.Nullable final CallDisposition value) {
        this.backingStore.set("targetDisposition", value);
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     */
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this.backingStore.set("targets", value);
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("timeout", value);
    }
}
