package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class OnPremisesDirectorySynchronization extends Entity implements Parsable {
    /** The configuration property */
    private OnPremisesDirectorySynchronizationConfiguration _configuration;
    /** The features property */
    private OnPremisesDirectorySynchronizationFeature _features;
    /**
     * Instantiates a new onPremisesDirectorySynchronization and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronization() {
        super();
        this.setOdataType("#microsoft.graph.onPremisesDirectorySynchronization");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesDirectorySynchronization
     */
    @javax.annotation.Nonnull
    public static OnPremisesDirectorySynchronization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronization();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a onPremisesDirectorySynchronizationConfiguration
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronizationConfiguration getConfiguration() {
        return this._configuration;
    }
    /**
     * Gets the features property value. The features property
     * @return a onPremisesDirectorySynchronizationFeature
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronizationFeature getFeatures() {
        return this._features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesDirectorySynchronization currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("configuration", (n) -> { currentObject.setConfiguration(n.getObjectValue(OnPremisesDirectorySynchronizationConfiguration::createFromDiscriminatorValue)); });
            this.put("features", (n) -> { currentObject.setFeatures(n.getObjectValue(OnPremisesDirectorySynchronizationFeature::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeObjectValue("features", this.getFeatures());
    }
    /**
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final OnPremisesDirectorySynchronizationConfiguration value) {
        this._configuration = value;
    }
    /**
     * Sets the features property value. The features property
     * @param value Value to set for the features property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeatures(@javax.annotation.Nullable final OnPremisesDirectorySynchronizationFeature value) {
        this._features = value;
    }
}
