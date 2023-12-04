package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing configurations in this profile you can instruct the Gmail email client on Android For Work devices to communicate with an Exchange server and get email, contacts, calendar, tasks, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkGmailEasConfiguration extends AndroidForWorkEasEmailProfileBase implements Parsable {
    /**
     * Instantiates a new AndroidForWorkGmailEasConfiguration and sets the default values.
     */
    public AndroidForWorkGmailEasConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkGmailEasConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkGmailEasConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkGmailEasConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkGmailEasConfiguration();
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
