package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationIdentityMatchingConfiguration extends EducationIdentitySynchronizationConfiguration implements Parsable {
    /**
     * Instantiates a new EducationIdentityMatchingConfiguration and sets the default values.
     */
    public EducationIdentityMatchingConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.educationIdentityMatchingConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationIdentityMatchingConfiguration
     */
    @jakarta.annotation.Nonnull
    public static EducationIdentityMatchingConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationIdentityMatchingConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("matchingOptions", (n) -> { this.setMatchingOptions(n.getCollectionOfObjectValues(EducationIdentityMatchingOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matchingOptions property value. Mapping between the user account and the options to use to uniquely identify the user to update.
     * @return a java.util.List<EducationIdentityMatchingOptions>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationIdentityMatchingOptions> getMatchingOptions() {
        return this.backingStore.get("matchingOptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("matchingOptions", this.getMatchingOptions());
    }
    /**
     * Sets the matchingOptions property value. Mapping between the user account and the options to use to uniquely identify the user to update.
     * @param value Value to set for the matchingOptions property.
     */
    public void setMatchingOptions(@jakarta.annotation.Nullable final java.util.List<EducationIdentityMatchingOptions> value) {
        this.backingStore.set("matchingOptions", value);
    }
}
