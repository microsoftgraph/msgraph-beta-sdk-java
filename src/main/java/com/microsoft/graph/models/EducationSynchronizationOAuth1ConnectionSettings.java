package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationOAuth1ConnectionSettings extends EducationSynchronizationConnectionSettings implements Parsable {
    /**
     * Instantiates a new EducationSynchronizationOAuth1ConnectionSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationSynchronizationOAuth1ConnectionSettings() {
        super();
        this.setOdataType("#microsoft.graph.educationSynchronizationOAuth1ConnectionSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSynchronizationOAuth1ConnectionSettings
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationOAuth1ConnectionSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationOAuth1ConnectionSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationOAuth1ConnectionSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
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
    }
}
