package com.microsoft.graph.serviceprincipals.item.synchronization.jobs.item.provisionondemand;

import com.microsoft.graph.models.SynchronizationJobApplicationParameters;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the provisionOnDemand method. */
public class ProvisionOnDemandPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The parameters property */
    private java.util.List<SynchronizationJobApplicationParameters> _parameters;
    /**
     * Instantiates a new provisionOnDemandPostRequestBody and sets the default values.
     * @return a void
     */
    public ProvisionOnDemandPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisionOnDemandPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ProvisionOnDemandPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisionOnDemandPostRequestBody();
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
        final ProvisionOnDemandPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("parameters", (n) -> { currentObject.setParameters(n.getCollectionOfObjectValues(SynchronizationJobApplicationParameters::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the parameters property value. The parameters property
     * @return a synchronizationJobApplicationParameters
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationJobApplicationParameters> getParameters() {
        return this._parameters;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
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
     * Sets the parameters property value. The parameters property
     * @param value Value to set for the parameters property.
     * @return a void
     */
    public void setParameters(@javax.annotation.Nullable final java.util.List<SynchronizationJobApplicationParameters> value) {
        this._parameters = value;
    }
}
