package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Bundle array configuration item inside an Android application&apos;s custom configuration schema.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConfigurationSchemaItemBundleArray extends AppConfigurationSchemaItemType implements Parsable {
    /**
     * Instantiates a new {@link AppConfigurationSchemaItemBundleArray} and sets the default values.
     */
    public AppConfigurationSchemaItemBundleArray() {
        super();
        this.setOdataType("#microsoft.graph.appConfigurationSchemaItemBundleArray");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppConfigurationSchemaItemBundleArray}
     */
    @jakarta.annotation.Nonnull
    public static AppConfigurationSchemaItemBundleArray createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConfigurationSchemaItemBundleArray();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
