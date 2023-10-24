package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsIdentity extends AuthorizationSystemIdentity implements Parsable {
    /**
     * Instantiates a new AwsIdentity and sets the default values.
     */
    public AwsIdentity() {
        super();
        this.setOdataType("#microsoft.graph.awsIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsIdentity
     */
    @jakarta.annotation.Nonnull
    public static AwsIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.awsAccessKey": return new AwsAccessKey();
                case "#microsoft.graph.awsEc2Instance": return new AwsEc2Instance();
                case "#microsoft.graph.awsGroup": return new AwsGroup();
                case "#microsoft.graph.awsLambda": return new AwsLambda();
                case "#microsoft.graph.awsRole": return new AwsRole();
                case "#microsoft.graph.awsUser": return new AwsUser();
            }
        }
        return new AwsIdentity();
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
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
