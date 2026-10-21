package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluationIncompleteActivityMetadata extends ProcessContentMetadataBase implements Parsable {
    /**
     * Instantiates a new {@link EvaluationIncompleteActivityMetadata} and sets the default values.
     */
    public EvaluationIncompleteActivityMetadata() {
        super();
        this.setOdataType("#microsoft.graph.evaluationIncompleteActivityMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluationIncompleteActivityMetadata}
     */
    @jakarta.annotation.Nonnull
    public static EvaluationIncompleteActivityMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluationIncompleteActivityMetadata();
    }
    /**
     * Gets the errorAction property value. The errorAction property
     * @return a {@link EnumSet<ErrorActions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ErrorActions> getErrorAction() {
        return this.backingStore.get("errorAction");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorAction", (n) -> { this.setErrorAction(n.getEnumSetValue(ErrorActions::forValue)); });
        deserializerMap.put("inspectionIncompleteReason", (n) -> { this.setInspectionIncompleteReason(n.getObjectValue(EvaluationErrorDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inspectionIncompleteReason property value. The inspectionIncompleteReason property
     * @return a {@link EvaluationErrorDetail}
     */
    @jakarta.annotation.Nullable
    public EvaluationErrorDetail getInspectionIncompleteReason() {
        return this.backingStore.get("inspectionIncompleteReason");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("errorAction", this.getErrorAction());
        writer.writeObjectValue("inspectionIncompleteReason", this.getInspectionIncompleteReason());
    }
    /**
     * Sets the errorAction property value. The errorAction property
     * @param value Value to set for the errorAction property.
     */
    public void setErrorAction(@jakarta.annotation.Nullable final EnumSet<ErrorActions> value) {
        this.backingStore.set("errorAction", value);
    }
    /**
     * Sets the inspectionIncompleteReason property value. The inspectionIncompleteReason property
     * @param value Value to set for the inspectionIncompleteReason property.
     */
    public void setInspectionIncompleteReason(@jakarta.annotation.Nullable final EvaluationErrorDetail value) {
        this.backingStore.set("inspectionIncompleteReason", value);
    }
}
