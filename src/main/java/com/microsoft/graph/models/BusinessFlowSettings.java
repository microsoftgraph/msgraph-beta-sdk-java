package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BusinessFlowSettings extends AccessReviewSettings implements Parsable {
    /** The durationInDays property */
    private Integer _durationInDays;
    /**
     * Instantiates a new BusinessFlowSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BusinessFlowSettings() {
        super();
        this.setOdataType("#microsoft.graph.businessFlowSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BusinessFlowSettings
     */
    @javax.annotation.Nonnull
    public static BusinessFlowSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessFlowSettings();
    }
    /**
     * Gets the durationInDays property value. The durationInDays property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDurationInDays() {
        return this._durationInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BusinessFlowSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("durationInDays", (n) -> { currentObject.setDurationInDays(n.getIntegerValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
    }
    /**
     * Sets the durationInDays property value. The durationInDays property
     * @param value Value to set for the durationInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._durationInDays = value;
    }
}
