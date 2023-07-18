package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An abstract base class for all iOS-specific single sign-on extension types.
 */
public class IosSingleSignOnExtension extends SingleSignOnExtension implements Parsable {
    /**
     * Instantiates a new iosSingleSignOnExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.iosSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosSingleSignOnExtension
     */
    @javax.annotation.Nonnull
    public static IosSingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosAzureAdSingleSignOnExtension": return new IosAzureAdSingleSignOnExtension();
                case "#microsoft.graph.iosCredentialSingleSignOnExtension": return new IosCredentialSingleSignOnExtension();
                case "#microsoft.graph.iosKerberosSingleSignOnExtension": return new IosKerberosSingleSignOnExtension();
                case "#microsoft.graph.iosRedirectSingleSignOnExtension": return new IosRedirectSingleSignOnExtension();
            }
        }
        return new IosSingleSignOnExtension();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
