package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StaleSignInAlertConfiguration extends UnifiedRoleManagementAlertConfiguration implements Parsable {
    /**
     * The number of days to look back from current timestamp within which the account has not signed in.
     */
    private PeriodAndDuration duration;
    /**
     * Instantiates a new staleSignInAlertConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public StaleSignInAlertConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.staleSignInAlertConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a staleSignInAlertConfiguration
     */
    @jakarta.annotation.Nonnull
    public static StaleSignInAlertConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StaleSignInAlertConfiguration();
    }
    /**
     * Gets the duration property value. The number of days to look back from current timestamp within which the account has not signed in.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.duration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
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
        writer.writePeriodAndDurationValue("duration", this.getDuration());
    }
    /**
     * Sets the duration property value. The number of days to look back from current timestamp within which the account has not signed in.
     * @param value Value to set for the duration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = value;
    }
}
