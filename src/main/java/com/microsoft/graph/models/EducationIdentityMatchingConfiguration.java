package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationIdentityMatchingConfiguration extends EducationIdentitySynchronizationConfiguration implements Parsable {
    /** Mapping between the user account and the options to use to uniquely identify the user to update. */
    private java.util.List<EducationIdentityMatchingOptions> matchingOptions;
    /**
     * Instantiates a new EducationIdentityMatchingConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationIdentityMatchingConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.educationIdentityMatchingConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationIdentityMatchingConfiguration
     */
    @javax.annotation.Nonnull
    public static EducationIdentityMatchingConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationIdentityMatchingConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("matchingOptions", (n) -> { this.setMatchingOptions(n.getCollectionOfObjectValues(EducationIdentityMatchingOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matchingOptions property value. Mapping between the user account and the options to use to uniquely identify the user to update.
     * @return a educationIdentityMatchingOptions
     */
    @javax.annotation.Nullable
    public java.util.List<EducationIdentityMatchingOptions> getMatchingOptions() {
        return this.matchingOptions;
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
        writer.writeCollectionOfObjectValues("matchingOptions", this.getMatchingOptions());
    }
    /**
     * Sets the matchingOptions property value. Mapping between the user account and the options to use to uniquely identify the user to update.
     * @param value Value to set for the matchingOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchingOptions(@javax.annotation.Nullable final java.util.List<EducationIdentityMatchingOptions> value) {
        this.matchingOptions = value;
    }
}
