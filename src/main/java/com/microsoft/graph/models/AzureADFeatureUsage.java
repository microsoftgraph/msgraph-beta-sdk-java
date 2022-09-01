package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureADFeatureUsage extends Entity implements Parsable {
    /** The featureName property */
    private String _featureName;
    /** The snapshotDateTime property */
    private OffsetDateTime _snapshotDateTime;
    /** The usage property */
    private Integer _usage;
    /**
     * Instantiates a new AzureADFeatureUsage and sets the default values.
     * @return a void
     */
    public AzureADFeatureUsage() {
        super();
        this.setOdataType("#microsoft.graph.azureADFeatureUsage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureADFeatureUsage
     */
    @javax.annotation.Nonnull
    public static AzureADFeatureUsage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADFeatureUsage();
    }
    /**
     * Gets the featureName property value. The featureName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeatureName() {
        return this._featureName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AzureADFeatureUsage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("featureName", (n) -> { currentObject.setFeatureName(n.getStringValue()); });
            this.put("snapshotDateTime", (n) -> { currentObject.setSnapshotDateTime(n.getOffsetDateTimeValue()); });
            this.put("usage", (n) -> { currentObject.setUsage(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the snapshotDateTime property value. The snapshotDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSnapshotDateTime() {
        return this._snapshotDateTime;
    }
    /**
     * Gets the usage property value. The usage property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsage() {
        return this._usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("featureName", this.getFeatureName());
        writer.writeOffsetDateTimeValue("snapshotDateTime", this.getSnapshotDateTime());
        writer.writeIntegerValue("usage", this.getUsage());
    }
    /**
     * Sets the featureName property value. The featureName property
     * @param value Value to set for the featureName property.
     * @return a void
     */
    public void setFeatureName(@javax.annotation.Nullable final String value) {
        this._featureName = value;
    }
    /**
     * Sets the snapshotDateTime property value. The snapshotDateTime property
     * @param value Value to set for the snapshotDateTime property.
     * @return a void
     */
    public void setSnapshotDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._snapshotDateTime = value;
    }
    /**
     * Sets the usage property value. The usage property
     * @param value Value to set for the usage property.
     * @return a void
     */
    public void setUsage(@javax.annotation.Nullable final Integer value) {
        this._usage = value;
    }
}
