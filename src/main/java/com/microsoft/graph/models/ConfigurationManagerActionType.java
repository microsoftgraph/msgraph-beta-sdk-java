package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the triggerConfigurationManagerAction method.  */
public enum ConfigurationManagerActionType implements ValuedEnum {
    RefreshMachinePolicy("refreshMachinePolicy"),
    RefreshUserPolicy("refreshUserPolicy"),
    WakeUpClient("wakeUpClient"),
    AppEvaluation("appEvaluation"),
    QuickScan("quickScan"),
    FullScan("fullScan"),
    WindowsDefenderUpdateSignatures("windowsDefenderUpdateSignatures");
    public final String value;
    ConfigurationManagerActionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConfigurationManagerActionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "refreshMachinePolicy": return RefreshMachinePolicy;
            case "refreshUserPolicy": return RefreshUserPolicy;
            case "wakeUpClient": return WakeUpClient;
            case "appEvaluation": return AppEvaluation;
            case "quickScan": return QuickScan;
            case "fullScan": return FullScan;
            case "windowsDefenderUpdateSignatures": return WindowsDefenderUpdateSignatures;
            default: return null;
        }
    }
}
