package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationCsvDataProvider extends EducationSynchronizationDataProvider implements Parsable {
    /**
     * Instantiates a new {@link EducationCsvDataProvider} and sets the default values.
     */
    public EducationCsvDataProvider() {
        super();
        this.setOdataType("#microsoft.graph.educationCsvDataProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationCsvDataProvider}
     */
    @jakarta.annotation.Nonnull
    public static EducationCsvDataProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationCsvDataProvider();
    }
    /**
     * Gets the customizations property value. Optional customizations to be applied to the synchronization profile.
     * @return a {@link EducationSynchronizationCustomizations}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomizations getCustomizations() {
        return this.backingStore.get("customizations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customizations", (n) -> { this.setCustomizations(n.getObjectValue(EducationSynchronizationCustomizations::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("customizations", this.getCustomizations());
    }
    /**
     * Sets the customizations property value. Optional customizations to be applied to the synchronization profile.
     * @param value Value to set for the customizations property.
     */
    public void setCustomizations(@jakarta.annotation.Nullable final EducationSynchronizationCustomizations value) {
        this.backingStore.set("customizations", value);
    }
}
