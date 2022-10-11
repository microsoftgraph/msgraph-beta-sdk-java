package com.microsoft.graph.devicemanagement.devicecompliancepolicies.setscheduledretirestate;

import com.microsoft.graph.models.ScheduledRetireState;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the setScheduledRetireState method. */
public class SetScheduledRetireStatePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The managedDeviceIds property */
    private java.util.List<String> _managedDeviceIds;
    /** Cancel or confirm scheduled retire  */
    private ScheduledRetireState _state;
    /**
     * Instantiates a new setScheduledRetireStatePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SetScheduledRetireStatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setScheduledRetireStatePostRequestBody
     */
    @javax.annotation.Nonnull
    public static SetScheduledRetireStatePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetScheduledRetireStatePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SetScheduledRetireStatePostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("managedDeviceIds", (n) -> { currentObject.setManagedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ScheduledRetireState.class)); });
        }};
    }
    /**
     * Gets the managedDeviceIds property value. The managedDeviceIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getManagedDeviceIds() {
        return this._managedDeviceIds;
    }
    /**
     * Gets the state property value. Cancel or confirm scheduled retire 
     * @return a scheduledRetireState
     */
    @javax.annotation.Nullable
    public ScheduledRetireState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("managedDeviceIds", this.getManagedDeviceIds());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the managedDeviceIds property value. The managedDeviceIds property
     * @param value Value to set for the managedDeviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._managedDeviceIds = value;
    }
    /**
     * Sets the state property value. Cancel or confirm scheduled retire 
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ScheduledRetireState value) {
        this._state = value;
    }
}
