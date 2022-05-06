package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationJobRestartCriteria implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Comma-separated combination of the following values: Full, QuarantineState, Watermark, Escrows, ConnectorDataStore. Use Full if you want all of the options.  */
    private SynchronizationJobRestartScope _resetScope;
    /**
     * Instantiates a new synchronizationJobRestartCriteria and sets the default values.
     * @return a void
     */
    public SynchronizationJobRestartCriteria() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJobRestartCriteria
     */
    @javax.annotation.Nonnull
    public static SynchronizationJobRestartCriteria createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJobRestartCriteria();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationJobRestartCriteria currentObject = this;
        return new HashMap<>(1) {{
            this.put("resetScope", (n) -> { currentObject.setResetScope(n.getEnumValue(SynchronizationJobRestartScope.class)); });
        }};
    }
    /**
     * Gets the resetScope property value. Comma-separated combination of the following values: Full, QuarantineState, Watermark, Escrows, ConnectorDataStore. Use Full if you want all of the options.
     * @return a synchronizationJobRestartScope
     */
    @javax.annotation.Nullable
    public SynchronizationJobRestartScope getResetScope() {
        return this._resetScope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("resetScope", this.getResetScope());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the resetScope property value. Comma-separated combination of the following values: Full, QuarantineState, Watermark, Escrows, ConnectorDataStore. Use Full if you want all of the options.
     * @param value Value to set for the resetScope property.
     * @return a void
     */
    public void setResetScope(@javax.annotation.Nullable final SynchronizationJobRestartScope value) {
        this._resetScope = value;
    }
}
