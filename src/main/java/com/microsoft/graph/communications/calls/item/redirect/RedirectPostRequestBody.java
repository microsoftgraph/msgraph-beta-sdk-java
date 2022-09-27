package com.microsoft.graph.communications.calls.item.redirect;

import com.microsoft.graph.models.CallDisposition;
import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the redirect method. */
public class RedirectPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The callbackUri property */
    private String _callbackUri;
    /** The maskCallee property */
    private Boolean _maskCallee;
    /** The maskCaller property */
    private Boolean _maskCaller;
    /** The targetDisposition property */
    private CallDisposition _targetDisposition;
    /** The targets property */
    private java.util.List<InvitationParticipantInfo> _targets;
    /** The timeout property */
    private Integer _timeout;
    /**
     * Instantiates a new redirectPostRequestBody and sets the default values.
     * @return a void
     */
    public RedirectPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redirectPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RedirectPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the callbackUri property value. The callbackUri property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallbackUri() {
        return this._callbackUri;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RedirectPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("callbackUri", (n) -> { currentObject.setCallbackUri(n.getStringValue()); });
            this.put("maskCallee", (n) -> { currentObject.setMaskCallee(n.getBooleanValue()); });
            this.put("maskCaller", (n) -> { currentObject.setMaskCaller(n.getBooleanValue()); });
            this.put("targetDisposition", (n) -> { currentObject.setTargetDisposition(n.getEnumValue(CallDisposition.class)); });
            this.put("targets", (n) -> { currentObject.setTargets(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
            this.put("timeout", (n) -> { currentObject.setTimeout(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the maskCallee property value. The maskCallee property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMaskCallee() {
        return this._maskCallee;
    }
    /**
     * Gets the maskCaller property value. The maskCaller property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMaskCaller() {
        return this._maskCaller;
    }
    /**
     * Gets the targetDisposition property value. The targetDisposition property
     * @return a callDisposition
     */
    @javax.annotation.Nullable
    public CallDisposition getTargetDisposition() {
        return this._targetDisposition;
    }
    /**
     * Gets the targets property value. The targets property
     * @return a invitationParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getTargets() {
        return this._targets;
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTimeout() {
        return this._timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the callbackUri property value. The callbackUri property
     * @param value Value to set for the callbackUri property.
     * @return a void
     */
    public void setCallbackUri(@javax.annotation.Nullable final String value) {
        this._callbackUri = value;
    }
    /**
     * Sets the maskCallee property value. The maskCallee property
     * @param value Value to set for the maskCallee property.
     * @return a void
     */
    public void setMaskCallee(@javax.annotation.Nullable final Boolean value) {
        this._maskCallee = value;
    }
    /**
     * Sets the maskCaller property value. The maskCaller property
     * @param value Value to set for the maskCaller property.
     * @return a void
     */
    public void setMaskCaller(@javax.annotation.Nullable final Boolean value) {
        this._maskCaller = value;
    }
    /**
     * Sets the targetDisposition property value. The targetDisposition property
     * @param value Value to set for the targetDisposition property.
     * @return a void
     */
    public void setTargetDisposition(@javax.annotation.Nullable final CallDisposition value) {
        this._targetDisposition = value;
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     * @return a void
     */
    public void setTargets(@javax.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this._targets = value;
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     * @return a void
     */
    public void setTimeout(@javax.annotation.Nullable final Integer value) {
        this._timeout = value;
    }
}
