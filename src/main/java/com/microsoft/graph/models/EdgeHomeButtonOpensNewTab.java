package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Show the home button; clicking the home button loads the New tab page.
 */
public class EdgeHomeButtonOpensNewTab extends EdgeHomeButtonConfiguration implements Parsable {
    /**
     * Instantiates a new edgeHomeButtonOpensNewTab and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public EdgeHomeButtonOpensNewTab() {
        super();
        this.setOdataType("#microsoft.graph.edgeHomeButtonOpensNewTab");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a edgeHomeButtonOpensNewTab
     */
    @jakarta.annotation.Nonnull
    public static EdgeHomeButtonOpensNewTab createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeHomeButtonOpensNewTab();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
